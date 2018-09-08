# -*- encoding: utf-8 -*-
# stub: faraday_middleware 0.9.2 ruby lib

Gem::Specification.new do |s|
  s.name = "faraday_middleware".freeze
  s.version = "0.9.2"

  s.required_rubygems_version = Gem::Requirement.new(">= 1.3.5".freeze) if s.respond_to? :required_rubygems_version=
  s.require_paths = ["lib".freeze]
  s.authors = ["Erik Michaels-Ober".freeze, "Wynn Netherland".freeze]
  s.date = "2015-07-07"
  s.description = "Various middleware for Faraday".freeze
  s.email = ["sferik@gmail.com".freeze, "wynn.netherland@gmail.com".freeze]
  s.homepage = "https://github.com/lostisland/faraday_middleware".freeze
  s.licenses = ["MIT".freeze]
  s.rubygems_version = "2.6.6".freeze
  s.summary = "Various middleware for Faraday".freeze

  s.installed_by_version = "2.6.6" if s.respond_to? :installed_by_version

  if s.respond_to? :specification_version then
    s.specification_version = 4

    if Gem::Version.new(Gem::VERSION) >= Gem::Version.new('1.2.0') then
      s.add_runtime_dependency(%q<faraday>.freeze, ["< 0.10", ">= 0.7.4"])
      s.add_development_dependency(%q<bundler>.freeze, ["~> 1.0"])
    else
      s.add_dependency(%q<faraday>.freeze, ["< 0.10", ">= 0.7.4"])
      s.add_dependency(%q<bundler>.freeze, ["~> 1.0"])
    end
  else
    s.add_dependency(%q<faraday>.freeze, ["< 0.10", ">= 0.7.4"])
    s.add_dependency(%q<bundler>.freeze, ["~> 1.0"])
  end
end
