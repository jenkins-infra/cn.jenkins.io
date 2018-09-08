# -*- encoding: utf-8 -*-
# stub: haml-i18n-extractor 0.5.9 ruby lib

Gem::Specification.new do |s|
  s.name = "haml-i18n-extractor".freeze
  s.version = "0.5.9"

  s.required_rubygems_version = Gem::Requirement.new(">= 0".freeze) if s.respond_to? :required_rubygems_version=
  s.require_paths = ["lib".freeze]
  s.authors = ["Shai Rosenfeld".freeze]
  s.date = "2013-09-30"
  s.description = "Parse the texts out of the haml files into localization files".freeze
  s.email = ["shaiguitar@gmail.com".freeze]
  s.executables = ["haml-i18n-extractor".freeze]
  s.files = ["bin/haml-i18n-extractor".freeze]
  s.homepage = "https://github.com/shaiguitar/haml-i18n-extractor".freeze
  s.licenses = ["MIT".freeze]
  s.rubygems_version = "2.6.6".freeze
  s.summary = "Parse the texts out of the haml files into localization files".freeze

  s.installed_by_version = "2.6.6" if s.respond_to? :installed_by_version

  if s.respond_to? :specification_version then
    s.specification_version = 3

    if Gem::Version.new(Gem::VERSION) >= Gem::Version.new('1.2.0') then
      s.add_runtime_dependency(%q<tilt>.freeze, [">= 0"])
      s.add_runtime_dependency(%q<haml>.freeze, [">= 0"])
      s.add_runtime_dependency(%q<activesupport>.freeze, [">= 0"])
      s.add_runtime_dependency(%q<highline>.freeze, [">= 0"])
      s.add_runtime_dependency(%q<trollop>.freeze, ["= 1.16.2"])
      s.add_development_dependency(%q<rbench>.freeze, [">= 0"])
      s.add_development_dependency(%q<m>.freeze, [">= 0"])
      s.add_development_dependency(%q<pry>.freeze, [">= 0"])
      s.add_development_dependency(%q<pry-remote>.freeze, [">= 0"])
      s.add_development_dependency(%q<pry-nav>.freeze, [">= 0"])
      s.add_development_dependency(%q<minitest>.freeze, [">= 0"])
      s.add_development_dependency(%q<nokogiri>.freeze, [">= 0"])
      s.add_development_dependency(%q<rake>.freeze, [">= 0"])
      s.add_development_dependency(%q<actionpack>.freeze, [">= 0"])
      s.add_development_dependency(%q<rails>.freeze, [">= 0"])
    else
      s.add_dependency(%q<tilt>.freeze, [">= 0"])
      s.add_dependency(%q<haml>.freeze, [">= 0"])
      s.add_dependency(%q<activesupport>.freeze, [">= 0"])
      s.add_dependency(%q<highline>.freeze, [">= 0"])
      s.add_dependency(%q<trollop>.freeze, ["= 1.16.2"])
      s.add_dependency(%q<rbench>.freeze, [">= 0"])
      s.add_dependency(%q<m>.freeze, [">= 0"])
      s.add_dependency(%q<pry>.freeze, [">= 0"])
      s.add_dependency(%q<pry-remote>.freeze, [">= 0"])
      s.add_dependency(%q<pry-nav>.freeze, [">= 0"])
      s.add_dependency(%q<minitest>.freeze, [">= 0"])
      s.add_dependency(%q<nokogiri>.freeze, [">= 0"])
      s.add_dependency(%q<rake>.freeze, [">= 0"])
      s.add_dependency(%q<actionpack>.freeze, [">= 0"])
      s.add_dependency(%q<rails>.freeze, [">= 0"])
    end
  else
    s.add_dependency(%q<tilt>.freeze, [">= 0"])
    s.add_dependency(%q<haml>.freeze, [">= 0"])
    s.add_dependency(%q<activesupport>.freeze, [">= 0"])
    s.add_dependency(%q<highline>.freeze, [">= 0"])
    s.add_dependency(%q<trollop>.freeze, ["= 1.16.2"])
    s.add_dependency(%q<rbench>.freeze, [">= 0"])
    s.add_dependency(%q<m>.freeze, [">= 0"])
    s.add_dependency(%q<pry>.freeze, [">= 0"])
    s.add_dependency(%q<pry-remote>.freeze, [">= 0"])
    s.add_dependency(%q<pry-nav>.freeze, [">= 0"])
    s.add_dependency(%q<minitest>.freeze, [">= 0"])
    s.add_dependency(%q<nokogiri>.freeze, [">= 0"])
    s.add_dependency(%q<rake>.freeze, [">= 0"])
    s.add_dependency(%q<actionpack>.freeze, [">= 0"])
    s.add_dependency(%q<rails>.freeze, [">= 0"])
  end
end
