# The authorship helper helps display authorship for a given entity
#
# This only renders something if the author has put information in
# content/_data/authors and the document has an `author` attribute in its
# front-matter
module Authorship
  # The order of preference for linking an author based on their meta-data
  AUTHOR_LINK_PREFERENCE = [
    [:github, 'https://github.com/VALUE'],
    [:twitter, 'https://twitter.com/VALUE'],
    [:blog, 'VALUE'],
  ].freeze

  def display_author_for(node, link = nil)
    # bail early if what we were given doesn't even respond
    return unless node.author

    author = node.author.to_sym

    if node.author && site.authors.has_key?(author)
      full_name = site.authors[author].name

      # If the caller provided a link use it, otherwise
      if link.nil?
        # Let's find a nice link to give our author
        AUTHOR_LINK_PREFERENCE.each do |link_type, url|
          value = site.authors[author].send(link_type)
          # If we didn't get anything, skip
          next if value.nil?

          link = url.gsub(/VALUE/, value.to_s)
          break unless link.nil?
        end

        if link.nil?
          return full_name
        end
      end

      return "<a href=\"#{link}\">#{full_name}</a>"
    end

    return node.author
  end

  def display_translator_for(node, link = nil)
    # bail early if what we were given doesn't even respond
    return unless node.translator

    translator = node.translator.to_sym

    if node.translator && site.authors.has_key?(translator)
      full_name = site.authors[translator].name

      # If the caller provided a link use it, otherwise
      if link.nil?
        # Let's find a nice link to give our author
        AUTHOR_LINK_PREFERENCE.each do |link_type, url|
          value = site.authors[translator].send(link_type)
          # If we didn't get anything, skip
          next if value.nil?

          link = url.gsub(/VALUE/, value.to_s)
          break unless link.nil?
        end

        if link.nil?
          return full_name
        end
      end

      return "<a href=\"#{link}\" target=\"_blank\">#{full_name}</a>"
    end

    return node.translator
  end
end
