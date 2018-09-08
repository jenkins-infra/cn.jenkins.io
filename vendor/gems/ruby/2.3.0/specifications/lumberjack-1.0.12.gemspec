# -*- encoding: utf-8 -*-
# stub: lumberjack 1.0.12 ruby lib

Gem::Specification.new do |s|
  s.name = "lumberjack".freeze
  s.version = "1.0.12"

  s.required_rubygems_version = Gem::Requirement.new(">= 0".freeze) if s.respond_to? :required_rubygems_version=
  s.require_paths = ["lib".freeze]
  s.authors = ["Brian Durand".freeze]
  s.date = "2017-05-11"
  s.description = "A simple, powerful, and very fast logging utility that can be a drop in replacement for Logger or ActiveSupport::BufferedLogger. Provides support for automatically rolling log files even with multiple processes writing the same log file.".freeze
  s.email = ["bbdurand@gmail.com".freeze]
  s.homepage = "http://github.com/bdurand/lumberjack".freeze
  s.licenses = ["MIT".freeze]
  s.rubygems_version = "2.6.6".freeze
  s.summary = "A simple, powerful, and very fast logging utility that can be a drop in replacement for Logger or ActiveSupport::BufferedLogger.".freeze

  s.installed_by_version = "2.6.6" if s.respond_to? :installed_by_version

  if s.respond_to? :specification_version then
    s.specification_version = 4

    if Gem::Version.new(Gem::VERSION) >= Gem::Version.new('1.2.0') then
      s.add_development_dependency(%q<rspec>.freeze, ["~> 3.0"])
      s.add_development_dependency(%q<timecop>.freeze, ["~> 0.8"])
    else
      s.add_dependency(%q<rspec>.freeze, ["~> 3.0"])
      s.add_dependency(%q<timecop>.freeze, ["~> 0.8"])
    end
  else
    s.add_dependency(%q<rspec>.freeze, ["~> 3.0"])
    s.add_dependency(%q<timecop>.freeze, ["~> 0.8"])
  end
end
