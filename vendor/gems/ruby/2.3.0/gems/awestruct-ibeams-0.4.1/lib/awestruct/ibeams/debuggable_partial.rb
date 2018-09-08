require 'awestruct/extensions/partial'

module Awestruct
  module IBeams
    # Debuggbale partial is just like a regular partial in awestruct except
    # there are HTML comments which make it clearer which files are being
    # included where in the rendered output
    module DebuggablePartial
      include Awestruct::Extensions::Partial
      alias_method :original_partial, :partial

      def partial(path, params={})
        return [
          "<!-- starting partial #{path} -->",
          original_partial(path, params),
          "<!-- ending partial #{path} -->",
        ].join("\n")
      end
    end
  end
end
