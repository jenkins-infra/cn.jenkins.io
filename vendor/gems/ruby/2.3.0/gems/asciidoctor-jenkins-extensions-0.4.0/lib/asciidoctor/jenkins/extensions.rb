module Asciidoctor
  module Jenkins
    module Extensions
    end
  end
end

Dir.glob("#{File.dirname(__FILE__)}/extensions/**/*.rb").each do |f|
  require f
end
