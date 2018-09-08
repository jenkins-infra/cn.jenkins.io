# -*- encoding: utf-8 -*-
# stub: awestruct-ibeams 0.4.1 ruby lib

Gem::Specification.new do |s|
  s.name = "awestruct-ibeams".freeze
  s.version = "0.4.1"

  s.required_rubygems_version = Gem::Requirement.new(">= 0".freeze) if s.respond_to? :required_rubygems_version=
  s.require_paths = ["lib".freeze]
  s.authors = ["R. Tyler Croy".freeze]
  s.bindir = "exe".freeze
  s.date = "2016-12-29"
  s.description = "Collection of helpful Awestruct extensions and helpers".freeze
  s.email = ["tyler@monkeypox.org".freeze]
  s.homepage = "https://github.com/jenkins-infra/awestruct-ibeams".freeze
  s.rubygems_version = "2.6.6".freeze
  s.summary = "Collection of helpful Awestruct extensions and helpers".freeze

  s.installed_by_version = "2.6.6" if s.respond_to? :installed_by_version

  if s.respond_to? :specification_version then
    s.specification_version = 4

    if Gem::Version.new(Gem::VERSION) >= Gem::Version.new('1.2.0') then
      s.add_runtime_dependency(%q<awestruct>.freeze, ["~> 0.5.6"])
      s.add_runtime_dependency(%q<naturally>.freeze, ["~> 2.1.0"])
    else
      s.add_dependency(%q<awestruct>.freeze, ["~> 0.5.6"])
      s.add_dependency(%q<naturally>.freeze, ["~> 2.1.0"])
    end
  else
    s.add_dependency(%q<awestruct>.freeze, ["~> 0.5.6"])
    s.add_dependency(%q<naturally>.freeze, ["~> 2.1.0"])
  end
end
