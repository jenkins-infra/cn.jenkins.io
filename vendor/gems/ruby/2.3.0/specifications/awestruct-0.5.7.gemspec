# -*- encoding: utf-8 -*-
# stub: awestruct 0.5.7 ruby lib

Gem::Specification.new do |s|
  s.name = "awestruct".freeze
  s.version = "0.5.7"

  s.required_rubygems_version = Gem::Requirement.new(">= 0".freeze) if s.respond_to? :required_rubygems_version=
  s.require_paths = ["lib".freeze]
  s.authors = ["Bob McWhirter".freeze, "Jason Porter".freeze, "Lance Ball".freeze, "Dan Allen".freeze, "Torsten Curdt".freeze, "other contributors".freeze]
  s.date = "2016-02-09"
  s.description = "Awestruct is a static site baking and publishing tool. It supports an extensive list of both templating and markup languages via Tilt (Haml, Slim, AsciiDoc, Markdown, Sass via Compass, etc), provides mobile-first layout and styling via Bootstrap or Foundation, offers a variety of deployment options (rsync, git, S3), handles site optimizations (minification, compression, cache busting), includes built-in extensions such as blog post management and is highly extensible.".freeze
  s.email = ["bob@mcwhirter.org".freeze, "lightguard.jp@gmail.com".freeze, "lball@redhat.com".freeze, "dan.j.allen@gmail.com".freeze, "tcurdt@vafer.org".freeze]
  s.executables = ["awestruct".freeze]
  s.extra_rdoc_files = ["README.md".freeze]
  s.files = ["README.md".freeze, "bin/awestruct".freeze]
  s.homepage = "http://awestruct.org".freeze
  s.licenses = ["MIT".freeze]
  s.rdoc_options = ["--charset=UTF-8".freeze]
  s.required_ruby_version = Gem::Requirement.new(">= 2.0".freeze)
  s.requirements = ["Any markup languages you are using and its dependencies.\nHaml and Markdown filters are touchy things. Redcarpet or Rdiscount work well if you're running on MRI. JRuby should be using haml 4.0.0+ with Kramdown.\nCompass and sass are no longer hard dependencies. You'll need too add them on your own should you want them. We also should be able to work with sassc.\n".freeze]
  s.rubyforge_project = "awestruct".freeze
  s.rubygems_version = "2.6.6".freeze
  s.summary = "Static site baking and publishing tool".freeze

  s.installed_by_version = "2.6.6" if s.respond_to? :installed_by_version

  if s.respond_to? :specification_version then
    s.specification_version = 4

    if Gem::Version.new(Gem::VERSION) >= Gem::Version.new('1.2.0') then
      s.add_runtime_dependency(%q<haml>.freeze, [">= 4.0.5", "~> 4.0"])
      s.add_runtime_dependency(%q<asciidoctor>.freeze, [">= 1.5.2", "~> 1.5"])
      s.add_runtime_dependency(%q<tilt>.freeze, [">= 2.0.1", "~> 2.0"])
      s.add_runtime_dependency(%q<mime-types>.freeze, ["~> 2.1"])
      s.add_runtime_dependency(%q<rest-client>.freeze, [">= 1.7.2", "~> 1.7"])
      s.add_runtime_dependency(%q<listen>.freeze, ["<= 4.0", ">= 2.7.1"])
      s.add_runtime_dependency(%q<rack>.freeze, [">= 1.5.2", "~> 1.5"])
      s.add_runtime_dependency(%q<git>.freeze, [">= 1.2.6", "~> 1.2"])
      s.add_runtime_dependency(%q<guard>.freeze, [">= 2.13.0", "~> 2.13"])
      s.add_runtime_dependency(%q<guard-livereload>.freeze, [">= 2.1.2", "~> 2.1"])
      s.add_runtime_dependency(%q<logging>.freeze, ["~> 2.0"])
      s.add_runtime_dependency(%q<oga>.freeze, ["~> 1.3"])
      s.add_runtime_dependency(%q<parallel>.freeze, ["> 1.1.1", "~> 1.1"])
      s.add_development_dependency(%q<nokogiri>.freeze, [">= 1.5.10", "~> 1.5.0"])
      s.add_development_dependency(%q<compass-960-plugin>.freeze, [">= 0.10.4", "~> 0.10"])
      s.add_development_dependency(%q<bootstrap-sass>.freeze, [">= 3.2.0.2", "~> 3"])
      s.add_development_dependency(%q<zurb-foundation>.freeze, [">= 4.3.2", "~> 4.3.2"])
      s.add_development_dependency(%q<rspec>.freeze, ["~> 3.0"])
      s.add_development_dependency(%q<guard-rspec>.freeze, ["~> 4.0"])
    else
      s.add_dependency(%q<haml>.freeze, [">= 4.0.5", "~> 4.0"])
      s.add_dependency(%q<asciidoctor>.freeze, [">= 1.5.2", "~> 1.5"])
      s.add_dependency(%q<tilt>.freeze, [">= 2.0.1", "~> 2.0"])
      s.add_dependency(%q<mime-types>.freeze, ["~> 2.1"])
      s.add_dependency(%q<rest-client>.freeze, [">= 1.7.2", "~> 1.7"])
      s.add_dependency(%q<listen>.freeze, ["<= 4.0", ">= 2.7.1"])
      s.add_dependency(%q<rack>.freeze, [">= 1.5.2", "~> 1.5"])
      s.add_dependency(%q<git>.freeze, [">= 1.2.6", "~> 1.2"])
      s.add_dependency(%q<guard>.freeze, [">= 2.13.0", "~> 2.13"])
      s.add_dependency(%q<guard-livereload>.freeze, [">= 2.1.2", "~> 2.1"])
      s.add_dependency(%q<logging>.freeze, ["~> 2.0"])
      s.add_dependency(%q<oga>.freeze, ["~> 1.3"])
      s.add_dependency(%q<parallel>.freeze, ["> 1.1.1", "~> 1.1"])
      s.add_dependency(%q<nokogiri>.freeze, [">= 1.5.10", "~> 1.5.0"])
      s.add_dependency(%q<compass-960-plugin>.freeze, [">= 0.10.4", "~> 0.10"])
      s.add_dependency(%q<bootstrap-sass>.freeze, [">= 3.2.0.2", "~> 3"])
      s.add_dependency(%q<zurb-foundation>.freeze, [">= 4.3.2", "~> 4.3.2"])
      s.add_dependency(%q<rspec>.freeze, ["~> 3.0"])
      s.add_dependency(%q<guard-rspec>.freeze, ["~> 4.0"])
    end
  else
    s.add_dependency(%q<haml>.freeze, [">= 4.0.5", "~> 4.0"])
    s.add_dependency(%q<asciidoctor>.freeze, [">= 1.5.2", "~> 1.5"])
    s.add_dependency(%q<tilt>.freeze, [">= 2.0.1", "~> 2.0"])
    s.add_dependency(%q<mime-types>.freeze, ["~> 2.1"])
    s.add_dependency(%q<rest-client>.freeze, [">= 1.7.2", "~> 1.7"])
    s.add_dependency(%q<listen>.freeze, ["<= 4.0", ">= 2.7.1"])
    s.add_dependency(%q<rack>.freeze, [">= 1.5.2", "~> 1.5"])
    s.add_dependency(%q<git>.freeze, [">= 1.2.6", "~> 1.2"])
    s.add_dependency(%q<guard>.freeze, [">= 2.13.0", "~> 2.13"])
    s.add_dependency(%q<guard-livereload>.freeze, [">= 2.1.2", "~> 2.1"])
    s.add_dependency(%q<logging>.freeze, ["~> 2.0"])
    s.add_dependency(%q<oga>.freeze, ["~> 1.3"])
    s.add_dependency(%q<parallel>.freeze, ["> 1.1.1", "~> 1.1"])
    s.add_dependency(%q<nokogiri>.freeze, [">= 1.5.10", "~> 1.5.0"])
    s.add_dependency(%q<compass-960-plugin>.freeze, [">= 0.10.4", "~> 0.10"])
    s.add_dependency(%q<bootstrap-sass>.freeze, [">= 3.2.0.2", "~> 3"])
    s.add_dependency(%q<zurb-foundation>.freeze, [">= 4.3.2", "~> 4.3.2"])
    s.add_dependency(%q<rspec>.freeze, ["~> 3.0"])
    s.add_dependency(%q<guard-rspec>.freeze, ["~> 4.0"])
  end
end
