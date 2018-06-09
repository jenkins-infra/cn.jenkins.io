require 'i18n'
require "i18n/backend/fallbacks"

module I18nHelper
  @initialized = false

  def initialize
    if (!@initialized)
      I18n::Backend::Simple.include(I18n::Backend::Fallbacks)
      I18n.config.available_locales = [:en, :'zh-CN']
      I18n.default_locale = :en
      unless ENV['SITE_LANG'].empty?
        I18n.locale = ENV['SITE_LANG']
      end
      Dir['content/_messages/*.yml'].each {|file|
        I18n.load_path << file
      }
      @initialized = true
    end
  end

  def t(msg)
    initialize
    content = Dir.pwd + "/content/"
    caller = caller_locations.first.path
    msg_prefix = caller[content.length..caller.length - 1 - '.html.haml'.length].gsub(File::SEPARATOR, ".")
    return I18n.t(msg_prefix+msg)
  end
end
