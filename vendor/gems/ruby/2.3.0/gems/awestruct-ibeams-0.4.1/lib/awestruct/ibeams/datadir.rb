require 'yaml'

module Awestruct
  module IBeams
    # The +DataDir+ extension provided in +Awestruct::IBeams+ is a fork
    # of the original +Awestruct::Extensions::DataDir+ with some cleaned up
    # code to generate paths in a more cross-platform manner but to also
    # support +.yml+ files as native providers of data.
    #
    # That is to say, you can create a directory "bar/" which contains +foo.yml+ and
    # that will be loaded into +site.bar[:foo]+ directly
    class DataDir
      DEFAULT_DATADIR = '_data'.freeze

      def initialize(data_dir=DEFAULT_DATADIR)
        @data_dir = data_dir
      end

      def watch(watched_dirs)
          watched_dirs << @data_dir
      end

      def execute(site)
        Dir.glob(File.join(site.dir, @data_dir, '*')).each do |entry|
          next unless File.directory? entry
          data_key = File.basename(entry)
          data_map = {}
          Dir.glob(File.join(entry, '*')).each do |chunk|
            File.basename(chunk) =~ /^([^\.]+)/
            key = $1.to_sym
            chunk_page = nil
            if chunk.end_with?('.yml')
              begin	
		chunk_page = YAML.load_file(chunk)
              rescue
                puts chunk  
              end
            else
              chunk_page = site.engine.load_page(chunk)
            end
            data_map[key] = chunk_page
          end
          site.send("#{data_key}=", data_map)
        end
      end
    end
  end
end
