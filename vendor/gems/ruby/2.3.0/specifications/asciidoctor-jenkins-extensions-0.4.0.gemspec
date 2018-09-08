# -*- encoding: utf-8 -*-
# stub: asciidoctor-jenkins-extensions 0.4.0 ruby lib

Gem::Specification.new do |s|
  s.name = "asciidoctor-jenkins-extensions".freeze
  s.version = "0.4.0"

  s.required_rubygems_version = Gem::Requirement.new(">= 0".freeze) if s.respond_to? :required_rubygems_version=
  s.require_paths = ["lib".freeze]
  s.authors = ["R. Tyler Croy".freeze]
  s.bindir = "exe".freeze
  s.date = "2017-07-10"
  s.description = "a collection of Asciidoctor extensions which enable more advanced\nformatting in Jenkins-related content.\n".freeze
  s.email = ["tyler@monkeypox.org".freeze]
  s.homepage = "https://github.com/jenkins-infra/asciidoctor-jenkins-extensions".freeze
  s.rubygems_version = "2.6.6".freeze
  s.summary = "a collection of Asciidoctor extensions which enable more advanced formatting in Jenkins-related content.".freeze

  s.installed_by_version = "2.6.6" if s.respond_to? :installed_by_version

  if s.respond_to? :specification_version then
    s.specification_version = 4

    if Gem::Version.new(Gem::VERSION) >= Gem::Version.new('1.2.0') then
      s.add_runtime_dependency(%q<asciidoctor>.freeze, ["~> 1.5.5"])
      s.add_runtime_dependency(%q<coderay>.freeze, ["~> 1.1.1"])
      s.add_runtime_dependency(%q<colorize>.freeze, ["~> 0.8.1"])
      s.add_development_dependency(%q<bundler>.freeze, ["~> 1.11"])
      s.add_development_dependency(%q<rake>.freeze, ["~> 10.0"])
      s.add_development_dependency(%q<rspec>.freeze, [">= 0"])
      s.add_development_dependency(%q<rspec-its>.freeze, [">= 0"])
      s.add_development_dependency(%q<pry>.freeze, [">= 0"])
      s.add_development_dependency(%q<ci_reporter>.freeze, ["~> 2.0"])
      s.add_development_dependency(%q<ci_reporter_rspec>.freeze, ["~> 1.0"])
    else
      s.add_dependency(%q<asciidoctor>.freeze, ["~> 1.5.5"])
      s.add_dependency(%q<coderay>.freeze, ["~> 1.1.1"])
      s.add_dependency(%q<colorize>.freeze, ["~> 0.8.1"])
      s.add_dependency(%q<bundler>.freeze, ["~> 1.11"])
      s.add_dependency(%q<rake>.freeze, ["~> 10.0"])
      s.add_dependency(%q<rspec>.freeze, [">= 0"])
      s.add_dependency(%q<rspec-its>.freeze, [">= 0"])
      s.add_dependency(%q<pry>.freeze, [">= 0"])
      s.add_dependency(%q<ci_reporter>.freeze, ["~> 2.0"])
      s.add_dependency(%q<ci_reporter_rspec>.freeze, ["~> 1.0"])
    end
  else
    s.add_dependency(%q<asciidoctor>.freeze, ["~> 1.5.5"])
    s.add_dependency(%q<coderay>.freeze, ["~> 1.1.1"])
    s.add_dependency(%q<colorize>.freeze, ["~> 0.8.1"])
    s.add_dependency(%q<bundler>.freeze, ["~> 1.11"])
    s.add_dependency(%q<rake>.freeze, ["~> 10.0"])
    s.add_dependency(%q<rspec>.freeze, [">= 0"])
    s.add_dependency(%q<rspec-its>.freeze, [">= 0"])
    s.add_dependency(%q<pry>.freeze, [">= 0"])
    s.add_dependency(%q<ci_reporter>.freeze, ["~> 2.0"])
    s.add_dependency(%q<ci_reporter_rspec>.freeze, ["~> 1.0"])
  end
end
