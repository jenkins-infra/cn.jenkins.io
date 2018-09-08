
// line 1 "ext/java/org/liboga/xml/Lexer.rl"
package org.liboga.xml;


// line 4 "ext/java/org/liboga/xml/Lexer.rl"

import java.io.IOException;

import org.jcodings.Encoding;

import org.jruby.Ruby;
import org.jruby.RubyModule;
import org.jruby.RubyClass;
import org.jruby.RubyObject;
import org.jruby.RubyString;
import org.jruby.RubyFixnum;
import org.jruby.util.ByteList;
import org.jruby.anno.JRubyClass;
import org.jruby.anno.JRubyMethod;
import org.jruby.runtime.ThreadContext;
import org.jruby.runtime.ObjectAllocator;
import org.jruby.runtime.builtin.IRubyObject;

/**
 * Lexer support class for JRuby.
 *
 * The Lexer class contains the raw Ragel loop and calls back in to Ruby land
 * whenever a Ragel action is needed similar to the C extension setup.
 *
 * This class requires Ruby land to first define the `Oga::XML` namespace.
 */
@JRubyClass(name="Oga::XML::Lexer", parent="Object")
public class Lexer extends RubyObject
{
    /**
     * The current Ruby runtime.
     */
    private Ruby runtime;

    
// line 43 "ext/java/org/liboga/xml/Lexer.java"
private static byte[] init__java_lexer_actions_0()
{
	return new byte [] {
	    0,    1,    0,    1,    2,    1,    3,    1,    4,    1,    5,    1,
	    6,    1,    7,    1,    8,    1,    9,    1,   10,    1,   11,    1,
	   12,    1,   13,    1,   14,    1,   15,    1,   16,    1,   17,    1,
	   18,    1,   21,    1,   22,    1,   23,    1,   24,    1,   25,    1,
	   26,    1,   27,    1,   28,    1,   29,    1,   30,    1,   34,    1,
	   35,    1,   36,    1,   37,    1,   38,    1,   41,    1,   43,    1,
	   44,    1,   45,    1,   46,    1,   47,    1,   48,    1,   49,    1,
	   50,    1,   51,    1,   52,    1,   53,    1,   54,    1,   55,    1,
	   56,    1,   57,    1,   58,    1,   59,    1,   60,    1,   61,    1,
	   62,    1,   63,    1,   64,    1,   65,    1,   66,    1,   67,    1,
	   68,    1,   71,    1,   72,    1,   73,    1,   74,    1,   75,    1,
	   76,    1,   77,    1,   78,    1,   79,    1,   80,    2,    0,    1,
	    2,    0,   33,    2,    0,   40,    2,    0,   42,    2,    4,    0,
	    2,    4,   19,    2,    4,   20,    2,    4,   69,    2,    4,   70,
	    2,   31,    0,    2,   32,    0,    2,   39,    0
	};
}

private static final byte _java_lexer_actions[] = init__java_lexer_actions_0();


private static short[] init__java_lexer_key_offsets_0()
{
	return new short [] {
	    0,    0,    4,    5,    7,    9,   11,   13,   15,   17,   21,   22,
	   23,   24,   25,   26,   27,   38,   39,   40,   41,   42,   43,   44,
	   45,   46,   47,   48,   49,   50,   51,   52,   53,   54,   66,   70,
	   80,   91,  102,  103,  104,  105,  106,  107,  108,  109,  110,  111,
	  112,  113,  114,  115,  116,  117,  137,  138,  148,  159,  170,  181,
	  192,  203,  214,  225,  236,  247,  258,  271,  281,  282,  292,  303,
	  314,  325,  331,  332,  337,  342,  344,  358,  359,  370,  371,  372,
	  373,  386,  399,  400,  401,  403,  404,  405,  406,  408
	};
}

private static final short _java_lexer_key_offsets[] = init__java_lexer_key_offsets_0();


private static char[] init__java_lexer_trans_keys_0()
{
	return new char [] {
	   45,   68,   91,  100,   45,   79,  111,   67,   99,   84,  116,   89,
	  121,   80,  112,   69,  101,   13,   32,    9,   10,   67,   68,   65,
	   84,   65,   91,   47,   96,  120,    0,   44,   58,   64,   91,   94,
	  123,  127,   62,   62,  115,   99,  114,  105,  112,  116,   62,  115,
	  116,  121,  108,  101,   62,   60,   33,   47,   63,   96,    0,   44,
	   58,   64,   91,   94,  123,  127,   13,   32,    9,   10,   47,   96,
	    0,   44,   58,   64,   91,   94,  123,  127,   47,   96,  109,    0,
	   44,   58,   64,   91,   94,  123,  127,   47,   96,  108,    0,   44,
	   58,   64,   91,   94,  123,  127,   45,   45,   45,   93,   93,   93,
	   63,   63,   62,   39,   39,   34,   34,   93,   93,    9,   10,   13,
	   32,   34,   39,   47,   62,   80,   83,   91,   96,    0,   44,   58,
	   64,   92,   94,  123,  127,   10,   47,   96,    0,   44,   58,   64,
	   91,   94,  123,  127,   47,   85,   96,    0,   44,   58,   64,   91,
	   94,  123,  127,   47,   66,   96,    0,   44,   58,   64,   91,   94,
	  123,  127,   47,   76,   96,    0,   44,   58,   64,   91,   94,  123,
	  127,   47,   73,   96,    0,   44,   58,   64,   91,   94,  123,  127,
	   47,   67,   96,    0,   44,   58,   64,   91,   94,  123,  127,   47,
	   89,   96,    0,   44,   58,   64,   91,   94,  123,  127,   47,   83,
	   96,    0,   44,   58,   64,   91,   94,  123,  127,   47,   84,   96,
	    0,   44,   58,   64,   91,   94,  123,  127,   47,   69,   96,    0,
	   44,   58,   64,   91,   94,  123,  127,   47,   77,   96,    0,   44,
	   58,   64,   91,   94,  123,  127,   34,   39,   47,   63,   96,    0,
	   44,   58,   64,   91,   94,  123,  127,   47,   96,    0,   44,   58,
	   64,   91,   94,  123,  127,   62,   47,   96,    0,   44,   58,   64,
	   91,   94,  123,  127,   47,   58,   96,    0,   44,   59,   64,   91,
	   94,  123,  127,   47,   62,   96,    0,   44,   58,   64,   91,   94,
	  123,  127,   47,   58,   96,    0,   44,   59,   64,   91,   94,  123,
	  127,   13,   32,   34,   39,    9,   10,   10,   13,   32,   62,    9,
	   10,   13,   32,   62,    9,   10,   34,   39,   10,   13,   47,   61,
	   62,   96,    0,   44,   58,   64,   91,   94,  123,  127,   10,   47,
	   58,   96,    0,   44,   59,   64,   91,   94,  123,  127,   62,   60,
	   60,   60,   64,   96,    0,   32,   34,   44,   58,   62,   91,   94,
	  123,  127,   60,   64,   96,    0,   32,   34,   44,   58,   62,   91,
	   94,  123,  127,   60,   60,   47,   60,   60,   60,   60,   47,   60,
	   60,    0
	};
}

private static final char _java_lexer_trans_keys[] = init__java_lexer_trans_keys_0();


private static byte[] init__java_lexer_single_lengths_0()
{
	return new byte [] {
	    0,    4,    1,    2,    2,    2,    2,    2,    2,    2,    1,    1,
	    1,    1,    1,    1,    3,    1,    1,    1,    1,    1,    1,    1,
	    1,    1,    1,    1,    1,    1,    1,    1,    1,    4,    2,    2,
	    3,    3,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,
	    1,    1,    1,    1,    1,   12,    1,    2,    3,    3,    3,    3,
	    3,    3,    3,    3,    3,    3,    5,    2,    1,    2,    3,    3,
	    3,    4,    1,    3,    3,    2,    6,    1,    3,    1,    1,    1,
	    3,    3,    1,    1,    2,    1,    1,    1,    2,    1
	};
}

private static final byte _java_lexer_single_lengths[] = init__java_lexer_single_lengths_0();


private static byte[] init__java_lexer_range_lengths_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    1,    0,    0,
	    0,    0,    0,    0,    4,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    4,    1,    4,
	    4,    4,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    4,    0,    4,    4,    4,    4,    4,
	    4,    4,    4,    4,    4,    4,    4,    4,    0,    4,    4,    4,
	    4,    1,    0,    1,    1,    0,    4,    0,    4,    0,    0,    0,
	    5,    5,    0,    0,    0,    0,    0,    0,    0,    0
	};
}

private static final byte _java_lexer_range_lengths[] = init__java_lexer_range_lengths_0();


private static short[] init__java_lexer_index_offsets_0()
{
	return new short [] {
	    0,    0,    5,    7,   10,   13,   16,   19,   22,   25,   29,   31,
	   33,   35,   37,   39,   41,   49,   51,   53,   55,   57,   59,   61,
	   63,   65,   67,   69,   71,   73,   75,   77,   79,   81,   90,   94,
	  101,  109,  117,  119,  121,  123,  125,  127,  129,  131,  133,  135,
	  137,  139,  141,  143,  145,  147,  164,  166,  173,  181,  189,  197,
	  205,  213,  221,  229,  237,  245,  253,  263,  270,  272,  279,  287,
	  295,  303,  309,  311,  316,  321,  324,  335,  337,  345,  347,  349,
	  351,  360,  369,  371,  373,  376,  378,  380,  382,  385
	};
}

private static final short _java_lexer_index_offsets[] = init__java_lexer_index_offsets_0();


private static byte[] init__java_lexer_trans_targs_0()
{
	return new byte [] {
	    2,    3,   10,    3,   32,   32,   32,    4,    4,   32,    5,    5,
	   32,    6,    6,   32,    7,    7,   32,    8,    8,   32,    9,    9,
	   32,   34,   34,   34,   32,   11,   32,   12,   32,   13,   32,   14,
	   32,   15,   32,   32,   32,   32,   32,   36,   32,   32,   32,   32,
	   35,   38,   38,   41,   41,   20,   86,   21,   86,   22,   86,   23,
	   86,   24,   86,   25,   86,   86,   86,   27,   90,   28,   90,   29,
	   90,   30,   90,   31,   90,   90,   90,   33,   32,    1,   32,   16,
	   32,   32,   32,   32,   32,   32,   34,   34,   34,   32,   32,   32,
	   32,   32,   32,   32,   35,   32,   32,   37,   32,   32,   32,   32,
	   35,   32,   32,   35,   32,   32,   32,   32,   35,   40,   39,   38,
	   39,   17,   38,   43,   42,   41,   42,   18,   41,   46,   45,   44,
	   45,   44,   44,   47,   48,   47,   48,   49,   50,   49,   50,   51,
	   52,   51,   52,   53,   53,   54,   53,   53,   53,    0,   53,   56,
	   61,   53,    0,    0,    0,    0,    0,   55,   53,   53,   53,   53,
	   53,   53,   53,   53,   55,   53,   57,   53,   53,   53,   53,   53,
	   55,   53,   58,   53,   53,   53,   53,   53,   55,   53,   59,   53,
	   53,   53,   53,   53,   55,   53,   60,   53,   53,   53,   53,   53,
	   55,   53,   55,   53,   53,   53,   53,   53,   55,   53,   62,   53,
	   53,   53,   53,   53,   55,   53,   63,   53,   53,   53,   53,   53,
	   55,   53,   64,   53,   53,   53,   53,   53,   55,   53,   65,   53,
	   53,   53,   53,   53,   55,   53,   55,   53,   53,   53,   53,   53,
	   55,   66,   66,   66,   68,   66,   66,   66,   66,   66,   67,   66,
	   66,   66,   66,   66,   66,   67,   66,   66,    0,    0,    0,    0,
	    0,    0,   70,   69,   69,   69,   69,   69,   69,   69,   70,   71,
	   71,   71,   71,   71,   71,   71,   72,   71,   71,   71,   71,   71,
	   71,   71,   72,   74,   73,   73,   73,   73,   73,   73,   73,   75,
	   75,   75,   75,   76,   75,   75,   75,   75,   76,   77,   77,   77,
	   78,   79,   81,   78,   78,   78,   78,   78,   78,   78,   80,   78,
	   78,   78,   78,   78,   78,   78,   78,   78,   80,   78,   78,   85,
	   83,   84,   83,   84,   83,   83,   83,   83,   83,   83,   83,   82,
	   84,   83,   83,   83,   83,   83,   83,   83,   82,   88,   87,   86,
	   87,   19,   89,   86,   89,   86,   92,   91,   90,   91,   26,   93,
	   90,   93,   90,   32,   32,   32,   32,   32,   32,   32,   32,   32,
	   32,   32,   32,   32,   32,   32,   32,   38,   41,   86,   86,   86,
	   86,   86,   86,   86,   90,   90,   90,   90,   90,   90,   32,   32,
	   32,   32,   32,   38,   38,   41,   41,   44,   44,   47,   49,   51,
	   53,   53,   53,   53,   53,   53,   53,   53,   53,   53,   53,   53,
	   66,   66,   69,   71,   73,   75,   78,   78,   78,   82,   82,   82,
	   86,   86,   86,   90,   90,   90,    0
	};
}

private static final byte _java_lexer_trans_targs[] = init__java_lexer_trans_targs_0();


private static short[] init__java_lexer_trans_actions_0()
{
	return new short [] {
	    0,    0,    0,    0,  137,  121,  137,    0,    0,  137,    0,    0,
	  137,    0,    0,  137,    0,    0,  137,    0,    0,  137,    0,    0,
	  137,    1,    1,    1,  137,    0,  137,    0,  137,    0,  137,    0,
	  137,    0,  137,  123,  137,  137,  137,    0,  137,  137,  137,  137,
	  165,    9,   13,   15,   19,    0,  113,    0,  113,    0,  113,    0,
	  113,    0,  113,    0,  113,  109,  113,    0,  119,    0,  119,    0,
	  119,    0,  119,    0,  119,  115,  119,    7,  129,    0,  127,    0,
	  135,  135,  135,  135,  135,  125,    1,    1,    1,  131,  139,  139,
	  139,  139,  139,  139,  165,  133,  133,    0,  133,  133,  133,  133,
	  165,  133,  133,  162,  133,  133,  133,  133,  165,  153,    1,   11,
	    1,    0,   11,  153,    1,   17,    1,    0,   17,    1,    1,   23,
	    1,   21,   23,   25,    1,   27,    1,   29,    1,   31,    1,   33,
	    1,   35,    1,   47,   45,    0,   47,   41,   39,    0,   43,    0,
	    0,   37,    0,    0,    0,    0,    0,  159,   45,   51,   53,   53,
	   53,   53,   53,   53,  159,   49,    0,   49,   49,   49,   49,   49,
	  159,   49,    0,   49,   49,   49,   49,   49,  159,   49,    0,   49,
	   49,   49,   49,   49,  159,   49,    0,   49,   49,   49,   49,   49,
	  159,   49,  156,   49,   49,   49,   49,   49,  159,   49,    0,   49,
	   49,   49,   49,   49,  159,   49,    0,   49,   49,   49,   49,   49,
	  159,   49,    0,   49,   49,   49,   49,   49,  159,   49,    0,   49,
	   49,   49,   49,   49,  159,   49,  156,   49,   49,   49,   49,   49,
	  159,  171,  168,  144,    1,  144,  144,  144,  144,  144,    1,   57,
	   57,   57,   57,   57,   57,    0,   55,   59,    0,    0,    0,    0,
	    0,    0,    0,   63,   61,   63,   63,   63,   63,   63,    0,  147,
	  174,  147,  147,  147,  147,  147,    1,   67,   65,   67,   67,   67,
	   67,   67,    0,    1,  150,   69,   69,  150,   71,  150,   73,   75,
	   75,   75,   75,    0,   77,   77,   77,   77,    0,   81,   79,   83,
	   85,    0,    0,   89,   91,   95,   95,   95,   95,   95,    0,   85,
	   97,   99,   87,   99,   99,   99,   99,   99,    0,   93,  101,  141,
	    1,  141,    1,  141,    1,    1,    1,    1,    1,    1,    1,  105,
	  141,    1,    1,    1,    1,    1,    1,    1,  103,  153,    1,  111,
	    1,    0,    1,  111,    1,  111,  153,    1,  117,    1,    0,    1,
	  117,    1,  117,  137,  137,  137,  137,  137,  137,  137,  137,  137,
	  137,  137,  137,  137,  137,  137,  137,   13,   19,  113,  113,  113,
	  113,  113,  113,  113,  119,  119,  119,  119,  119,  119,  135,  131,
	  139,  133,  133,   11,   11,   17,   17,   23,   23,   27,   31,   35,
	   51,   53,   49,   49,   49,   49,   49,   49,   49,   49,   49,   49,
	   57,   59,   63,   67,   73,   77,   97,   99,  101,  107,  107,  107,
	  111,  111,  111,  117,  117,  117,    0
	};
}

private static final short _java_lexer_trans_actions[] = init__java_lexer_trans_actions_0();


private static short[] init__java_lexer_to_state_actions_0()
{
	return new short [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    3,    0,    0,    0,
	    0,    0,    3,    0,    0,    3,    0,    0,    3,    0,    0,    3,
	    0,    3,    0,    3,    0,    3,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    3,    0,    0,    3,    0,    3,
	    0,    3,    0,    3,    0,    3,    3,    0,    0,    0,    3,    0,
	    0,    0,    3,    0,    0,    0,    3,    0,    0,    0
	};
}

private static final short _java_lexer_to_state_actions[] = init__java_lexer_to_state_actions_0();


private static short[] init__java_lexer_from_state_actions_0()
{
	return new short [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    5,    0,    0,    0,
	    0,    0,    5,    0,    0,    5,    0,    0,    5,    0,    0,    5,
	    0,    5,    0,    5,    0,    5,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    5,    0,    0,    5,    0,    5,
	    0,    5,    0,    5,    0,    5,    5,    0,    0,    0,    5,    0,
	    0,    0,    5,    0,    0,    0,    5,    0,    0,    0
	};
}

private static final short _java_lexer_from_state_actions[] = init__java_lexer_from_state_actions_0();


private static short[] init__java_lexer_eof_trans_0()
{
	return new short [] {
	    0,  403,  403,  403,  403,  403,  403,  403,  403,  403,  403,  403,
	  403,  403,  403,  403,  403,  404,  405,  412,  412,  412,  412,  412,
	  412,  412,  418,  418,  418,  418,  418,  418,    0,  419,  420,  421,
	  423,  423,    0,  425,  425,    0,  427,  427,    0,  429,  429,    0,
	  430,    0,  431,    0,  432,    0,  433,  434,  444,  444,  444,  444,
	  444,  444,  444,  444,  444,  444,    0,  445,  446,    0,  447,    0,
	  448,    0,  449,    0,  450,    0,    0,  451,  452,  453,    0,  456,
	  456,  456,    0,  459,  459,  459,    0,  462,  462,  462
	};
}

private static final short _java_lexer_eof_trans[] = init__java_lexer_eof_trans_0();


static final int java_lexer_start = 32;
static final int java_lexer_first_final = 32;
static final int java_lexer_error = 0;

static final int java_lexer_en_comment_body = 38;
static final int java_lexer_en_cdata_body = 41;
static final int java_lexer_en_proc_ins_body = 44;
static final int java_lexer_en_string_squote = 47;
static final int java_lexer_en_string_dquote = 49;
static final int java_lexer_en_doctype_inline = 51;
static final int java_lexer_en_doctype = 53;
static final int java_lexer_en_xml_decl = 66;
static final int java_lexer_en_element_name = 69;
static final int java_lexer_en_element_close = 71;
static final int java_lexer_en_attribute_pre = 73;
static final int java_lexer_en_unquoted_attribute_value = 75;
static final int java_lexer_en_quoted_attribute_value = 77;
static final int java_lexer_en_element_head = 78;
static final int java_lexer_en_text = 82;
static final int java_lexer_en_html_script = 86;
static final int java_lexer_en_html_style = 90;
static final int java_lexer_en_main = 32;


// line 39 "ext/java/org/liboga/xml/Lexer.rl"

    /* Used by Ragel to keep track of the current state. */
    int act;
    int cs;
    int top;
    int lines;
    int[] stack;

    /**
     * Sets up the current class in the Ruby runtime.
     */
    public static void load(Ruby runtime)
    {
        RubyModule xml = (RubyModule) runtime.getModule("Oga")
            .getConstant("XML");

        RubyClass lexer = xml.defineClassUnder(
            "Lexer",
            runtime.getObject(),
            ALLOCATOR
        );

        lexer.defineAnnotatedMethods(Lexer.class);
    }

    private static final ObjectAllocator ALLOCATOR = new ObjectAllocator()
    {
        public IRubyObject allocate(Ruby runtime, RubyClass klass)
        {
            return new org.liboga.xml.Lexer(runtime, klass);
        }
    };

    public Lexer(Ruby runtime, RubyClass klass)
    {
        super(runtime, klass);

        this.runtime = runtime;
    }

    /**
     * Runs the bulk of the Ragel loop and calls back in to Ruby.
     *
     * This method pulls its data in from the instance variable `@data`. The
     * Ruby side of the Lexer class should set this variable to a String in its
     * constructor method. Encodings are passed along to make sure that token
     * values share the same encoding as the input.
     *
     * This method always returns nil.
     */
    @JRubyMethod
    public IRubyObject advance_native(ThreadContext context, RubyString rb_str)
    {
        Boolean html_p = this.callMethod(context, "html?").isTrue();

        Encoding encoding = rb_str.getEncoding();

        byte[] data = rb_str.getBytes();

        int ts    = 0;
        int te    = 0;
        int p     = 0;
        int mark  = 0;
        int lines = this.lines;
        int pe    = data.length;
        int eof   = data.length;

        String id_advance_line        = "advance_line";
        String id_on_attribute        = "on_attribute";
        String id_on_attribute_ns     = "on_attribute_ns";
        String id_on_cdata_start      = "on_cdata_start";
        String id_on_cdata_body       = "on_cdata_body";
        String id_on_cdata_end        = "on_cdata_end";
        String id_on_comment_start    = "on_comment_start";
        String id_on_comment_body     = "on_comment_body";
        String id_on_comment_end      = "on_comment_end";
        String id_on_doctype_end      = "on_doctype_end";
        String id_on_doctype_inline   = "on_doctype_inline";
        String id_on_doctype_name     = "on_doctype_name";
        String id_on_doctype_start    = "on_doctype_start";
        String id_on_doctype_type     = "on_doctype_type";
        String id_on_element_end      = "on_element_end";
        String id_on_element_name     = "on_element_name";
        String id_on_element_ns       = "on_element_ns";
        String id_on_element_open_end = "on_element_open_end";
        String id_on_proc_ins_end     = "on_proc_ins_end";
        String id_on_proc_ins_name    = "on_proc_ins_name";
        String id_on_proc_ins_start   = "on_proc_ins_start";
        String id_on_proc_ins_body    = "on_proc_ins_body";
        String id_on_string_body      = "on_string_body";
        String id_on_string_dquote    = "on_string_dquote";
        String id_on_string_squote    = "on_string_squote";
        String id_on_text             = "on_text";
        String id_on_xml_decl_end     = "on_xml_decl_end";
        String id_on_xml_decl_start   = "on_xml_decl_start";

        
// line 449 "ext/java/org/liboga/xml/Lexer.java"
	{
	int _klen;
	int _trans = 0;
	int _acts;
	int _nacts;
	int _keys;
	int _goto_targ = 0;

	_goto: while (true) {
	switch ( _goto_targ ) {
	case 0:
	if ( p == pe ) {
		_goto_targ = 4;
		continue _goto;
	}
	if ( ( this.cs) == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
case 1:
	_acts = _java_lexer_from_state_actions[( this.cs)];
	_nacts = (int) _java_lexer_actions[_acts++];
	while ( _nacts-- > 0 ) {
		switch ( _java_lexer_actions[_acts++] ) {
	case 3:
// line 1 "NONE"
	{ts = p;}
	break;
// line 478 "ext/java/org/liboga/xml/Lexer.java"
		}
	}

	_match: do {
	_keys = _java_lexer_key_offsets[( this.cs)];
	_trans = _java_lexer_index_offsets[( this.cs)];
	_klen = _java_lexer_single_lengths[( this.cs)];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + _klen - 1;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + ((_upper-_lower) >> 1);
			if ( data[p] < _java_lexer_trans_keys[_mid] )
				_upper = _mid - 1;
			else if ( data[p] > _java_lexer_trans_keys[_mid] )
				_lower = _mid + 1;
			else {
				_trans += (_mid - _keys);
				break _match;
			}
		}
		_keys += _klen;
		_trans += _klen;
	}

	_klen = _java_lexer_range_lengths[( this.cs)];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + (_klen<<1) - 2;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + (((_upper-_lower) >> 1) & ~1);
			if ( data[p] < _java_lexer_trans_keys[_mid] )
				_upper = _mid - 2;
			else if ( data[p] > _java_lexer_trans_keys[_mid+1] )
				_lower = _mid + 2;
			else {
				_trans += ((_mid - _keys)>>1);
				break _match;
			}
		}
		_trans += _klen;
	}
	} while (false);

case 3:
	( this.cs) = _java_lexer_trans_targs[_trans];

	if ( _java_lexer_trans_actions[_trans] != 0 ) {
		_acts = _java_lexer_trans_actions[_trans];
		_nacts = (int) _java_lexer_actions[_acts++];
		while ( _nacts-- > 0 )
	{
			switch ( _java_lexer_actions[_acts++] )
			{
	case 0:
// line 58 "ext/ragel/base_lexer.rl"
	{
        if ( data[p] == '\n' ) lines++;
    }
	break;
	case 1:
// line 605 "ext/ragel/base_lexer.rl"
	{ mark = p; }
	break;
	case 4:
// line 1 "NONE"
	{te = p+1;}
	break;
	case 5:
// line 104 "ext/ragel/base_lexer.rl"
	{te = p+1;{
            callback_simple(id_on_comment_end);

            ( this.cs) = 32;
        }}
	break;
	case 6:
// line 93 "ext/ragel/base_lexer.rl"
	{te = p;p--;{
            callback(id_on_comment_body, data, encoding, ts, te);

            if ( lines > 0 )
            {
                advance_line(lines);

                lines = 0;
            }
        }}
	break;
	case 7:
// line 93 "ext/ragel/base_lexer.rl"
	{{p = ((te))-1;}{
            callback(id_on_comment_body, data, encoding, ts, te);

            if ( lines > 0 )
            {
                advance_line(lines);

                lines = 0;
            }
        }}
	break;
	case 8:
// line 143 "ext/ragel/base_lexer.rl"
	{te = p+1;{
            callback_simple(id_on_cdata_end);

            ( this.cs) = 32;
        }}
	break;
	case 9:
// line 132 "ext/ragel/base_lexer.rl"
	{te = p;p--;{
            callback(id_on_cdata_body, data, encoding, ts, te);

            if ( lines > 0 )
            {
                advance_line(lines);

                lines = 0;
            }
        }}
	break;
	case 10:
// line 132 "ext/ragel/base_lexer.rl"
	{{p = ((te))-1;}{
            callback(id_on_cdata_body, data, encoding, ts, te);

            if ( lines > 0 )
            {
                advance_line(lines);

                lines = 0;
            }
        }}
	break;
	case 11:
// line 186 "ext/ragel/base_lexer.rl"
	{te = p+1;{
            callback_simple(id_on_proc_ins_end);

            ( this.cs) = 32;
        }}
	break;
	case 12:
// line 175 "ext/ragel/base_lexer.rl"
	{te = p;p--;{
            callback(id_on_proc_ins_body, data, encoding, ts, te);

            if ( lines > 0 )
            {
                advance_line(lines);

                lines = 0;
            }
        }}
	break;
	case 13:
// line 228 "ext/ragel/base_lexer.rl"
	{te = p+1;{
            callback_simple(id_on_string_squote);

            {( this.cs) = ( this.stack)[--( this.top)];_goto_targ = 2; if (true) continue _goto;}
        }}
	break;
	case 14:
// line 202 "ext/ragel/base_lexer.rl"
	{te = p;p--;{
        callback(id_on_string_body, data, encoding, ts, te);

        if ( lines > 0 )
        {
            advance_line(lines);

            lines = 0;
        }
    }}
	break;
	case 15:
// line 238 "ext/ragel/base_lexer.rl"
	{te = p+1;{
            callback_simple(id_on_string_dquote);

            {( this.cs) = ( this.stack)[--( this.top)];_goto_targ = 2; if (true) continue _goto;}
        }}
	break;
	case 16:
// line 202 "ext/ragel/base_lexer.rl"
	{te = p;p--;{
        callback(id_on_string_body, data, encoding, ts, te);

        if ( lines > 0 )
        {
            advance_line(lines);

            lines = 0;
        }
    }}
	break;
	case 17:
// line 283 "ext/ragel/base_lexer.rl"
	{te = p+1;{ ( this.cs) = 53; }}
	break;
	case 18:
// line 272 "ext/ragel/base_lexer.rl"
	{te = p;p--;{
            callback(id_on_doctype_inline, data, encoding, ts, te);

            if ( lines > 0 )
            {
                advance_line(lines);

                lines = 0;
            }
        }}
	break;
	case 19:
// line 289 "ext/ragel/base_lexer.rl"
	{( this.act) = 13;}
	break;
	case 20:
// line 300 "ext/ragel/base_lexer.rl"
	{( this.act) = 17;}
	break;
	case 21:
// line 294 "ext/ragel/base_lexer.rl"
	{te = p+1;{ ( this.cs) = 51; }}
	break;
	case 22:
// line 213 "ext/ragel/base_lexer.rl"
	{te = p+1;{
        callback_simple(id_on_string_squote);

        {( this.stack)[( this.top)++] = ( this.cs); ( this.cs) = 47; _goto_targ = 2; if (true) continue _goto;}
    }}
	break;
	case 23:
// line 219 "ext/ragel/base_lexer.rl"
	{te = p+1;{
        callback_simple(id_on_string_dquote);

        {( this.stack)[( this.top)++] = ( this.cs); ( this.cs) = 49; _goto_targ = 2; if (true) continue _goto;}
    }}
	break;
	case 24:
// line 304 "ext/ragel/base_lexer.rl"
	{te = p+1;{
            callback_simple(id_on_doctype_end);
            ( this.cs) = 32;
        }}
	break;
	case 25:
// line 62 "ext/ragel/base_lexer.rl"
	{te = p+1;{
        advance_line(1);
    }}
	break;
	case 26:
// line 311 "ext/ragel/base_lexer.rl"
	{te = p+1;}
	break;
	case 27:
// line 300 "ext/ragel/base_lexer.rl"
	{te = p;p--;{
            callback(id_on_doctype_name, data, encoding, ts, te);
        }}
	break;
	case 28:
// line 62 "ext/ragel/base_lexer.rl"
	{te = p;p--;{
        advance_line(1);
    }}
	break;
	case 29:
// line 1 "NONE"
	{	switch( ( this.act) ) {
	case 13:
	{{p = ((te))-1;}
            callback(id_on_doctype_type, data, encoding, ts, te);
        }
	break;
	case 17:
	{{p = ((te))-1;}
            callback(id_on_doctype_name, data, encoding, ts, te);
        }
	break;
	}
	}
	break;
	case 30:
// line 328 "ext/ragel/base_lexer.rl"
	{te = p+1;{
            if ( lines > 0 )
            {
                advance_line(lines);

                lines = 0;
            }

            callback_simple(id_on_xml_decl_end);

            ( this.cs) = 32;
        }}
	break;
	case 31:
// line 213 "ext/ragel/base_lexer.rl"
	{te = p+1;{
        callback_simple(id_on_string_squote);

        {( this.stack)[( this.top)++] = ( this.cs); ( this.cs) = 47; _goto_targ = 2; if (true) continue _goto;}
    }}
	break;
	case 32:
// line 219 "ext/ragel/base_lexer.rl"
	{te = p+1;{
        callback_simple(id_on_string_dquote);

        {( this.stack)[( this.top)++] = ( this.cs); ( this.cs) = 49; _goto_targ = 2; if (true) continue _goto;}
    }}
	break;
	case 33:
// line 356 "ext/ragel/base_lexer.rl"
	{te = p+1;}
	break;
	case 34:
// line 342 "ext/ragel/base_lexer.rl"
	{te = p;p--;{
            if ( lines > 0 )
            {
                advance_line(lines);

                lines = 0;
            }

            callback(id_on_attribute, data, encoding, ts, te);
        }}
	break;
	case 35:
// line 356 "ext/ragel/base_lexer.rl"
	{te = p;p--;}
	break;
	case 36:
// line 392 "ext/ragel/base_lexer.rl"
	{te = p+1;{
            callback(id_on_element_ns, data, encoding, ts, te - 1);
        }}
	break;
	case 37:
// line 396 "ext/ragel/base_lexer.rl"
	{te = p;p--;{
            callback(id_on_element_name, data, encoding, ts, te);
            ( this.cs) = 78;
        }}
	break;
	case 38:
// line 406 "ext/ragel/base_lexer.rl"
	{te = p+1;}
	break;
	case 39:
// line 410 "ext/ragel/base_lexer.rl"
	{te = p+1;{
            if ( lines > 0 )
            {
                advance_line(lines);

                lines = 0;
            }

            ( this.cs) = 32;
        }}
	break;
	case 40:
// line 421 "ext/ragel/base_lexer.rl"
	{te = p+1;}
	break;
	case 41:
// line 377 "ext/ragel/base_lexer.rl"
	{te = p;p--;{
        callback(id_on_element_end, data, encoding, ts, te);
    }}
	break;
	case 42:
// line 427 "ext/ragel/base_lexer.rl"
	{te = p+1;}
	break;
	case 43:
// line 429 "ext/ragel/base_lexer.rl"
	{te = p+1;{
            p--;

            if ( lines > 0 )
            {
                advance_line(lines);

                lines = 0;
            }

            ( this.cs) = 77;
        }}
	break;
	case 44:
// line 442 "ext/ragel/base_lexer.rl"
	{te = p+1;{
            p--;

            if ( lines > 0 )
            {
                advance_line(lines);

                lines = 0;
            }

            if ( html_p )
            {
                ( this.cs) = 75;
            }
            /* XML doesn't support unquoted attribute values */
            else
            {
                {( this.cs) = ( this.stack)[--( this.top)];_goto_targ = 2; if (true) continue _goto;}
            }
        }}
	break;
	case 45:
// line 427 "ext/ragel/base_lexer.rl"
	{te = p;p--;}
	break;
	case 46:
// line 66 "ext/ragel/base_lexer.rl"
	{te = p+1;{
        p--;
        {( this.cs) = ( this.stack)[--( this.top)];_goto_targ = 2; if (true) continue _goto;}
    }}
	break;
	case 47:
// line 480 "ext/ragel/base_lexer.rl"
	{te = p;p--;{
            callback_simple(id_on_string_squote);

            callback(id_on_string_body, data, encoding, ts, te);

            callback_simple(id_on_string_squote);
        }}
	break;
	case 48:
// line 496 "ext/ragel/base_lexer.rl"
	{te = p+1;{
            callback_simple(id_on_string_squote);

            ( this.cs) = 47;
        }}
	break;
	case 49:
// line 502 "ext/ragel/base_lexer.rl"
	{te = p+1;{
            callback_simple(id_on_string_dquote);

            ( this.cs) = 49;
        }}
	break;
	case 50:
// line 66 "ext/ragel/base_lexer.rl"
	{te = p+1;{
        p--;
        {( this.cs) = ( this.stack)[--( this.top)];_goto_targ = 2; if (true) continue _goto;}
    }}
	break;
	case 51:
// line 62 "ext/ragel/base_lexer.rl"
	{te = p+1;{
        advance_line(1);
    }}
	break;
	case 52:
// line 517 "ext/ragel/base_lexer.rl"
	{te = p+1;{
            callback(id_on_attribute_ns, data, encoding, ts, te - 1);
        }}
	break;
	case 53:
// line 526 "ext/ragel/base_lexer.rl"
	{te = p+1;{
            {( this.stack)[( this.top)++] = ( this.cs); ( this.cs) = 73; _goto_targ = 2; if (true) continue _goto;}
        }}
	break;
	case 54:
// line 531 "ext/ragel/base_lexer.rl"
	{te = p+1;{
            callback_simple(id_on_element_open_end);

            if ( html_script_p() )
            {
                ( this.cs) = 86;
            }
            else if ( html_style_p() )
            {
                ( this.cs) = 90;
            }
            else
            {
                ( this.cs) = 32;
            }
        }}
	break;
	case 55:
// line 549 "ext/ragel/base_lexer.rl"
	{te = p+1;{
            callback_simple(id_on_element_end);
            ( this.cs) = 32;
        }}
	break;
	case 56:
// line 554 "ext/ragel/base_lexer.rl"
	{te = p+1;}
	break;
	case 57:
// line 62 "ext/ragel/base_lexer.rl"
	{te = p;p--;{
        advance_line(1);
    }}
	break;
	case 58:
// line 521 "ext/ragel/base_lexer.rl"
	{te = p;p--;{
            callback(id_on_attribute, data, encoding, ts, te);
        }}
	break;
	case 59:
// line 554 "ext/ragel/base_lexer.rl"
	{te = p;p--;}
	break;
	case 60:
// line 591 "ext/ragel/base_lexer.rl"
	{te = p+1;{
            callback(id_on_text, data, encoding, ts, te);

            if ( lines > 0 )
            {
                advance_line(lines);

                lines = 0;
            }

            ( this.cs) = 32;
        }}
	break;
	case 61:
// line 605 "ext/ragel/base_lexer.rl"
	{te = p+1;{
            callback(id_on_text, data, encoding, ts, mark);

            p    = mark - 1;
            mark = 0;

            if ( lines > 0 )
            {
                advance_line(lines);

                lines = 0;
            }

            ( this.cs) = 32;
        }}
	break;
	case 62:
// line 591 "ext/ragel/base_lexer.rl"
	{te = p;p--;{
            callback(id_on_text, data, encoding, ts, te);

            if ( lines > 0 )
            {
                advance_line(lines);

                lines = 0;
            }

            ( this.cs) = 32;
        }}
	break;
	case 63:
// line 381 "ext/ragel/base_lexer.rl"
	{te = p+1;{
        callback_simple(id_on_element_end);

        ( this.cs) = 32;
    }}
	break;
	case 64:
// line 579 "ext/ragel/base_lexer.rl"
	{te = p;p--;{
        callback(id_on_text, data, encoding, ts, te);

        if ( lines > 0 )
        {
            advance_line(lines);

            lines = 0;
        }
    }}
	break;
	case 65:
// line 579 "ext/ragel/base_lexer.rl"
	{{p = ((te))-1;}{
        callback(id_on_text, data, encoding, ts, te);

        if ( lines > 0 )
        {
            advance_line(lines);

            lines = 0;
        }
    }}
	break;
	case 66:
// line 381 "ext/ragel/base_lexer.rl"
	{te = p+1;{
        callback_simple(id_on_element_end);

        ( this.cs) = 32;
    }}
	break;
	case 67:
// line 579 "ext/ragel/base_lexer.rl"
	{te = p;p--;{
        callback(id_on_text, data, encoding, ts, te);

        if ( lines > 0 )
        {
            advance_line(lines);

            lines = 0;
        }
    }}
	break;
	case 68:
// line 579 "ext/ragel/base_lexer.rl"
	{{p = ((te))-1;}{
        callback(id_on_text, data, encoding, ts, te);

        if ( lines > 0 )
        {
            advance_line(lines);

            lines = 0;
        }
    }}
	break;
	case 69:
// line 321 "ext/ragel/base_lexer.rl"
	{( this.act) = 54;}
	break;
	case 70:
// line 167 "ext/ragel/base_lexer.rl"
	{( this.act) = 57;}
	break;
	case 71:
// line 86 "ext/ragel/base_lexer.rl"
	{te = p+1;{
        callback_simple(id_on_comment_start);

        ( this.cs) = 38;
    }}
	break;
	case 72:
// line 125 "ext/ragel/base_lexer.rl"
	{te = p+1;{
        callback_simple(id_on_cdata_start);

        ( this.cs) = 41;
    }}
	break;
	case 73:
// line 368 "ext/ragel/base_lexer.rl"
	{te = p+1;{
        p--;
        ( this.cs) = 69;
    }}
	break;
	case 74:
// line 373 "ext/ragel/base_lexer.rl"
	{te = p+1;{
        ( this.cs) = 71;
    }}
	break;
	case 75:
// line 565 "ext/ragel/base_lexer.rl"
	{te = p+1;{
        p--;
        ( this.cs) = 82;
    }}
	break;
	case 76:
// line 257 "ext/ragel/base_lexer.rl"
	{te = p;p--;{
        callback_simple(id_on_doctype_start);

        if ( lines > 0 )
        {
            advance_line(lines);

            lines = 0;
        }

        ( this.cs) = 53;
    }}
	break;
	case 77:
// line 167 "ext/ragel/base_lexer.rl"
	{te = p;p--;{
        callback_simple(id_on_proc_ins_start);
        callback(id_on_proc_ins_name, data, encoding, ts + 2, te);

        ( this.cs) = 44;
    }}
	break;
	case 78:
// line 565 "ext/ragel/base_lexer.rl"
	{te = p;p--;{
        p--;
        ( this.cs) = 82;
    }}
	break;
	case 79:
// line 565 "ext/ragel/base_lexer.rl"
	{{p = ((te))-1;}{
        p--;
        ( this.cs) = 82;
    }}
	break;
	case 80:
// line 1 "NONE"
	{	switch( ( this.act) ) {
	case 54:
	{{p = ((te))-1;}
        callback_simple(id_on_xml_decl_start);
        ( this.cs) = 66;
    }
	break;
	case 57:
	{{p = ((te))-1;}
        callback_simple(id_on_proc_ins_start);
        callback(id_on_proc_ins_name, data, encoding, ts + 2, te);

        ( this.cs) = 44;
    }
	break;
	}
	}
	break;
// line 1236 "ext/java/org/liboga/xml/Lexer.java"
			}
		}
	}

case 2:
	_acts = _java_lexer_to_state_actions[( this.cs)];
	_nacts = (int) _java_lexer_actions[_acts++];
	while ( _nacts-- > 0 ) {
		switch ( _java_lexer_actions[_acts++] ) {
	case 2:
// line 1 "NONE"
	{ts = -1;}
	break;
// line 1250 "ext/java/org/liboga/xml/Lexer.java"
		}
	}

	if ( ( this.cs) == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
	if ( ++p != pe ) {
		_goto_targ = 1;
		continue _goto;
	}
case 4:
	if ( p == eof )
	{
	if ( _java_lexer_eof_trans[( this.cs)] > 0 ) {
		_trans = _java_lexer_eof_trans[( this.cs)] - 1;
		_goto_targ = 3;
		continue _goto;
	}
	}

case 5:
	}
	break; }
	}

// line 136 "ext/java/org/liboga/xml/Lexer.rl"

        this.lines = lines;

        return context.nil;
    }

    /**
     * Resets the internal state of the lexer.
     */
    @JRubyMethod
    public IRubyObject reset_native(ThreadContext context)
    {
        this.act   = 0;
        this.top   = 0;
        this.stack = new int[4];
        this.cs    = java_lexer_start;

        return context.nil;
    }

    /**
     * Calls back in to Ruby land passing the current token value along.
     *
     * This method calls back in to Ruby land based on the method name
     * specified in `name`. The Ruby callback should take one argument. This
     * argument will be a String containing the value of the current token.
     */
    public void callback(String name, byte[] data, Encoding enc, int ts, int te)
    {
        ByteList bytelist = new ByteList(data, ts, te - ts, enc, true);

        RubyString value = this.runtime.newString(bytelist);

        ThreadContext context = this.runtime.getCurrentContext();

        this.callMethod(context, name, value);
    }

    /**
     * Calls back in to Ruby land without passing any arguments.
     */
    public void callback_simple(String name)
    {
        ThreadContext context = this.runtime.getCurrentContext();

        this.callMethod(context, name);
    }

    /**
     * Advances the line number by `amount` lines.
     */
    public void advance_line(int amount)
    {
        ThreadContext context = this.runtime.getCurrentContext();
        RubyFixnum lines      = this.runtime.newFixnum(amount);

        this.callMethod(context, "advance_line", lines);
    }

    /**
     * @see Oga::XML::Lexer#html_script?
     */
    public Boolean html_script_p()
    {
        ThreadContext context = this.runtime.getCurrentContext();

        return this.callMethod(context, "html_script?").isTrue();
    }

    /**
     * @see Oga::XML::Lexer#html_style?
     */
    public Boolean html_style_p()
    {
        ThreadContext context = this.runtime.getCurrentContext();

        return this.callMethod(context, "html_style?").isTrue();
    }
}


// line 223 "ext/java/org/liboga/xml/Lexer.rl"

