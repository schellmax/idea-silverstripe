/* The following code was generated by JFlex 1.4.3 on 2013-03-30 00:58 */

package com.raket.silverstripe;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.raket.silverstripe.psi.SilverStripeTypes;
import com.raket.silverstripe.psi.SilverStripeTokenType;
import com.intellij.psi.TokenType;
import com.intellij.psi.*;
import com.intellij.psi.xml.*;
import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.containers.Stack;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 2013-03-30 00:58 from the specification file
 * <tt>C:/IdeaProjects/idea-silverstripe/src/com/raket/silverstripe/SilverStripe.flex</tt>
 */
class SilverStripeLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int SS_VAR = 2;
  public static final int SS_TRANSLATION = 16;
  public static final int SS_BLOCK_VAR = 8;
  public static final int SS_BLOCK_START = 6;
  public static final int SS_BAD_VAR = 10;
  public static final int SS_BAD_BLOCK_STATEMENT = 12;
  public static final int YYINITIAL = 0;
  public static final int SS_IF_STATEMENT = 18;
  public static final int SS_WITH_DELIMITER = 4;
  public static final int SS_COMMENT = 14;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9, 9
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\1\1\0\1\3\1\2\22\0\1\3\1\4\1\10"+
    "\1\0\1\5\1\17\1\40\1\11\1\7\1\12\3\0\1\47\1\13"+
    "\13\0\1\0\1\0\1\16\1\37\1\20\2\0\32\6\1\0\1\0"+
    "\2\0\1\36\1\0\1\45\1\44\1\30\1\43\1\34\1\33\1\46"+
    "\1\27\1\25\2\6\1\21\1\6\1\31\1\22\1\23\1\6\1\32"+
    "\1\35\1\26\1\42\1\6\1\24\3\6\1\14\1\41\1\15\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\11\0\3\1\1\2\2\3\1\4\1\2\1\5"+
    "\1\2\1\6\2\7\1\10\10\7\1\11\1\2\1\12"+
    "\3\2\2\3\1\4\2\2\2\3\1\4\2\2\2\3"+
    "\1\4\1\2\1\13\2\2\1\14\2\2\1\14\1\15"+
    "\2\2\1\16\1\17\1\20\1\21\3\0\1\22\10\0"+
    "\1\23\5\0\1\24\1\15\2\0\1\25\1\0\1\14"+
    "\1\26\2\0\1\27\16\0\1\15\4\0\1\30\1\31"+
    "\2\0\1\32\3\0\1\33\1\34\20\0\1\35\2\0"+
    "\1\36\1\37\7\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[152];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\50\0\120\0\170\0\240\0\310\0\360\0\u0118"+
    "\0\u0140\0\u0168\0\u0190\0\u01b8\0\u01e0\0\u0208\0\u0208\0\u0230"+
    "\0\u0258\0\u0280\0\u0208\0\u02a8\0\u0208\0\u0208\0\u0230\0\u02d0"+
    "\0\u02f8\0\u0320\0\u0348\0\u0370\0\u0398\0\u03c0\0\u03e8\0\u0410"+
    "\0\u0438\0\u0460\0\u0488\0\u0320\0\u04b0\0\u04d8\0\u04d8\0\u0500"+
    "\0\u0528\0\u0550\0\u0578\0\u0578\0\u05a0\0\u05c8\0\u05f0\0\u0618"+
    "\0\u0618\0\u0640\0\u0668\0\u0690\0\u06b8\0\u06e0\0\u0708\0\u0730"+
    "\0\u0758\0\u0780\0\u07a8\0\u06e0\0\u07d0\0\u07f8\0\u0820\0\u0848"+
    "\0\u0870\0\u0208\0\u0898\0\u08c0\0\u08e8\0\u0208\0\u0910\0\u0938"+
    "\0\u0960\0\u0988\0\u09b0\0\u09d8\0\u04d8\0\u0550\0\u0208\0\u0578"+
    "\0\u05f0\0\u0a00\0\u0618\0\u0690\0\u0208\0\u0208\0\u0a28\0\u0758"+
    "\0\u0208\0\u0780\0\u0a50\0\u0208\0\u0a78\0\u0aa0\0\u0208\0\u0ac8"+
    "\0\u0af0\0\u0b18\0\u0b40\0\u0b68\0\u0b90\0\u0bb8\0\u0be0\0\u0c08"+
    "\0\u0c30\0\u0c58\0\u0c80\0\u0ca8\0\u0cd0\0\u0730\0\u0cf8\0\u0d20"+
    "\0\u0d48\0\u0d70\0\u0208\0\u0208\0\u0d98\0\u0dc0\0\u0de8\0\u0e10"+
    "\0\u0e38\0\u0e60\0\u0208\0\u0208\0\u0e88\0\u0eb0\0\u0ed8\0\u0f00"+
    "\0\u0f28\0\u0f50\0\u0f78\0\u0fa0\0\u0fc8\0\u0ff0\0\u1018\0\u1040"+
    "\0\u1068\0\u1090\0\u10b8\0\u10e0\0\u0208\0\u1108\0\u1130\0\u0208"+
    "\0\u0208\0\u1158\0\u1180\0\u11a8\0\u11d0\0\u11f8\0\u1220\0\u1248";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[152];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\5\1\1\13\6\1\1\14\1\1\1\15\31\1\1\16"+
    "\1\17\1\20\1\21\1\16\1\22\6\16\1\23\34\16"+
    "\1\17\1\20\1\21\1\16\1\24\7\16\1\25\32\16"+
    "\1\26\1\17\1\27\1\30\12\26\1\31\1\32\1\26"+
    "\1\33\2\26\1\34\1\35\2\26\1\36\3\26\1\37"+
    "\7\26\1\40\3\26\1\16\1\17\1\20\1\41\1\16"+
    "\1\42\1\43\10\16\1\44\1\16\15\43\4\16\5\43"+
    "\1\45\1\16\1\17\1\20\1\21\44\16\1\46\1\47"+
    "\1\50\1\51\13\46\1\52\30\46\1\53\1\54\1\55"+
    "\1\56\43\53\1\57\1\60\1\61\1\62\1\63\13\60"+
    "\1\64\30\60\1\16\1\17\1\20\1\65\1\66\1\67"+
    "\1\70\1\16\1\71\1\72\5\16\1\44\1\16\10\70"+
    "\1\73\4\70\1\16\1\74\1\75\1\76\5\70\1\16"+
    "\5\1\1\13\1\0\5\1\1\14\1\1\1\15\2\1"+
    "\15\0\4\1\5\0\6\1\1\0\6\1\1\14\1\1"+
    "\1\15\36\1\1\13\6\1\1\14\1\1\1\15\1\0"+
    "\30\1\51\0\1\17\51\0\1\21\52\0\1\77\12\0"+
    "\15\77\4\0\5\77\7\0\1\100\12\0\15\100\4\0"+
    "\5\100\4\0\1\30\63\0\1\101\50\0\1\102\51\0"+
    "\1\103\52\0\1\104\53\0\1\105\1\0\1\106\36\0"+
    "\1\107\46\0\1\110\7\0\1\111\63\0\1\112\5\0"+
    "\1\41\52\0\1\43\12\0\15\43\4\0\5\43\7\0"+
    "\1\43\1\113\3\0\1\43\5\0\15\43\4\0\5\43"+
    "\50\0\1\114\17\115\1\116\31\115\1\47\15\115\1\116"+
    "\33\115\1\51\13\115\1\116\47\115\1\116\1\117\27\115"+
    "\47\120\1\121\1\120\1\54\45\120\1\121\3\120\1\56"+
    "\43\120\1\121\47\120\1\122\17\123\1\124\31\123\1\61"+
    "\15\123\1\124\33\123\1\63\13\123\1\124\47\123\1\124"+
    "\1\125\27\123\3\0\1\65\103\0\1\126\16\0\1\70"+
    "\12\0\15\70\4\0\5\70\7\0\1\70\1\127\3\0"+
    "\1\70\5\0\15\70\4\0\5\70\1\0\10\130\1\131"+
    "\37\130\11\132\1\131\36\132\6\0\1\70\1\127\3\0"+
    "\1\70\5\0\1\70\1\133\13\70\4\0\5\70\41\0"+
    "\1\134\50\0\1\134\14\0\1\77\1\135\3\0\1\77"+
    "\5\0\15\77\4\0\5\77\7\0\1\100\1\136\3\0"+
    "\1\100\5\0\15\100\4\0\5\100\27\0\1\137\20\0"+
    "\1\140\22\0\1\141\53\0\1\142\51\0\1\143\50\0"+
    "\1\144\53\0\1\145\55\0\1\146\41\0\1\147\20\0"+
    "\1\150\1\0\2\151\7\0\15\150\4\0\5\150\20\0"+
    "\1\152\30\0\17\120\1\153\27\120\1\122\6\0\1\154"+
    "\1\0\2\155\7\0\15\154\4\0\5\154\7\0\1\70"+
    "\1\127\3\0\1\70\5\0\5\70\1\156\7\70\4\0"+
    "\5\70\7\0\1\157\1\0\2\160\7\0\15\157\4\0"+
    "\5\157\7\0\1\161\1\0\2\162\7\0\15\161\4\0"+
    "\5\161\50\0\1\163\23\0\1\164\53\0\1\164\41\0"+
    "\1\165\54\0\1\166\55\0\1\167\51\0\1\170\45\0"+
    "\1\171\21\0\1\150\1\0\2\172\1\43\6\0\15\150"+
    "\4\0\5\150\7\0\1\150\12\0\15\150\4\0\5\150"+
    "\21\0\1\173\27\0\20\120\1\174\26\120\1\121\6\0"+
    "\1\154\1\0\2\175\1\70\6\0\15\154\4\0\5\154"+
    "\7\0\1\154\12\0\15\154\4\0\5\154\7\0\1\157"+
    "\1\0\2\176\1\77\6\0\15\157\4\0\5\157\7\0"+
    "\1\157\12\0\15\157\4\0\5\157\7\0\1\161\1\0"+
    "\2\177\1\100\6\0\15\161\4\0\5\161\7\0\1\161"+
    "\12\0\15\161\4\0\5\161\43\0\1\200\37\0\1\201"+
    "\53\0\1\202\32\0\1\203\2\0\1\204\1\205\2\0"+
    "\1\206\55\0\1\207\23\0\1\43\47\0\1\70\47\0"+
    "\1\77\47\0\1\100\100\0\1\210\26\0\1\211\52\0"+
    "\1\212\44\0\1\213\52\0\1\214\55\0\1\215\36\0"+
    "\1\216\53\0\1\217\55\0\1\220\34\0\1\164\61\0"+
    "\1\221\36\0\1\222\53\0\1\223\52\0\1\224\63\0"+
    "\1\225\25\0\1\215\53\0\1\215\46\0\1\226\67\0"+
    "\1\220\33\0\1\227\37\0\1\230\46\0\1\215\26\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4720];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\11\0\3\1\2\11\3\1\1\11\1\1\2\11"+
    "\53\1\1\11\3\0\1\11\10\0\1\11\5\0\2\11"+
    "\2\0\1\11\1\0\1\1\1\11\2\0\1\11\16\0"+
    "\1\1\4\0\2\11\2\0\1\1\3\0\2\11\20\0"+
    "\1\11\2\0\2\11\7\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[152];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Stack<Integer> stack = new Stack<Integer>();

    public void yypushState(int newState) {
      stack.push(yystate());
      yybegin(newState);
    }

 	public IElementType checkVariable(IElementType success, IElementType fail) {
        String matchedVar = yytext().toString();
        if (matchedVar.matches("(\\$[a-zA-Z]+)((\\((\\\"(?=[a-zA-Z]*\\\")|\\'(?=[a-zA-Z]*\\')|[a-zA-Z](?=[a-zA-Z]+))[a-zA-Z\\\"\\']+\\))|\\.[a-zA-Z]+)*")) {
           return success;
        }
        else {
           return fail;
        }
 	}

  	public IElementType checkBlockVariable(IElementType success, IElementType fail) {
        String matchedVar = yytext().toString();
        if (matchedVar.matches("(\\$?[a-zA-Z]+)((\\((\\\"(?=[a-zA-Z]*\\\")|\\'(?=[a-zA-Z]*\\')|[a-zA-Z](?=[a-zA-Z]+))[a-zA-Z\\\"\\']+\\))|\\.[a-zA-Z]+)*")) {
           return success;
        }
        else {
           return fail;
        }
 	}

    public void yypopState() {
      yybegin(stack.pop());
    }



  SilverStripeLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  SilverStripeLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 120) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 17: 
          { yybegin(YYINITIAL); return SilverStripeTypes.SS_BLOCK_END;
          }
        case 32: break;
        case 6: 
          { yybegin(YYINITIAL); return SilverStripeTypes.SS_VAR_END_DELIMITER;
          }
        case 33: break;
        case 14: 
          { yybegin(YYINITIAL); return checkVariable(SilverStripeTypes.SS_VAR, SilverStripeTypes.SS_BAD_VAR);
          }
        case 34: break;
        case 23: 
          { yybegin(SS_TRANSLATION); return SilverStripeTypes.SS_BLOCK_START;
          }
        case 35: break;
        case 24: 
          { yybegin(SS_COMMENT); return SilverStripeTypes.SS_COMMENT_START;
          }
        case 36: break;
        case 2: 
          { return TokenType.BAD_CHARACTER;
          }
        case 37: break;
        case 27: 
          { yybegin(YYINITIAL); return SilverStripeTypes.SS_COMMENT_END;
          }
        case 38: break;
        case 21: 
          { yybegin(SS_IF_STATEMENT); return SilverStripeTypes.SS_STRING;
          }
        case 39: break;
        case 1: 
          { if (yylength() > 0 && yytext().subSequence(yylength() - 1, yylength()).toString().equals("<")) {
            yypushback(1);
            yypushState(SS_BLOCK_START);
        }
        if (yylength() > 0 && yytext().subSequence(yylength() - 1, yylength()).toString().equals("$") ||
            yylength() > 0 && yytext().subSequence(yylength() - 1, yylength()).toString().equals("{") ) {
            yypushback(1);
            yybegin(SS_VAR);
        }

        // we stray from the Handlebars grammar a bit here since we need our WHITE_SPACE more clearly delineated
        //    and we need to avoid creating extra tokens for empty strings (makes the parser and formatter happier)
        if (!yytext().toString().equals("")) {
           if (yytext().toString().trim().length() == 0) {
               return TokenType.WHITE_SPACE;
           } else {
               return SilverStripeTypes.CONTENT;
           }
        }
          }
        case 40: break;
        case 11: 
          { yybegin(SS_IF_STATEMENT); return TokenType.WHITE_SPACE;
          }
        case 41: break;
        case 9: 
          { yybegin(SS_BLOCK_VAR); return TokenType.WHITE_SPACE;
          }
        case 42: break;
        case 28: 
          { yybegin(SS_BLOCK_VAR); yypushback(4); return SilverStripeTypes.COMMENT;
          }
        case 43: break;
        case 20: 
          { yybegin(SS_BLOCK_START); yypushback(2); return SilverStripeTypes.SS_TRANSLATION_CONTENT;
          }
        case 44: break;
        case 18: 
          { yybegin(SS_IF_STATEMENT); return SilverStripeTypes.SS_IF_KEYWORD;
          }
        case 45: break;
        case 8: 
          { yybegin(SS_BLOCK_START); return TokenType.WHITE_SPACE;
          }
        case 46: break;
        case 29: 
          { yybegin(SS_BLOCK_START); return SilverStripeTypes.SS_END_KEYWORD;
          }
        case 47: break;
        case 30: 
          { yybegin(SS_BLOCK_VAR); return SilverStripeTypes.SS_SIMPLE_KEYWORD;
          }
        case 48: break;
        case 25: 
          { yybegin(SS_BLOCK_VAR); return SilverStripeTypes.SS_START_KEYWORD;
          }
        case 49: break;
        case 22: 
          { yybegin(SS_IF_STATEMENT); return SilverStripeTypes.SS_AND_OR_OPERATOR;
          }
        case 50: break;
        case 3: 
          { yybegin(YYINITIAL); return SilverStripeTypes.CRLF;
          }
        case 51: break;
        case 26: 
          { yybegin(SS_BLOCK_START); return SilverStripeTypes.SS_ELSE_KEYWORD;
          }
        case 52: break;
        case 19: 
          { yybegin(SS_BLOCK_VAR); yypushback(2); return SilverStripeTypes.SS_BAD_BLOCK_STATEMENT;
          }
        case 53: break;
        case 12: 
          { yybegin(SS_IF_STATEMENT); return checkBlockVariable(SilverStripeTypes.SS_BLOCK_VAR, SilverStripeTypes.SS_BAD_VAR);
          }
        case 54: break;
        case 31: 
          { yybegin(SS_IF_STATEMENT); return SilverStripeTypes.SS_ELSE_IF_KEYWORD;
          }
        case 55: break;
        case 16: 
          { yybegin(SS_BLOCK_START); return SilverStripeTypes.SS_BLOCK_START;
          }
        case 56: break;
        case 5: 
          { yybegin(SS_WITH_DELIMITER); return SilverStripeTypes.SS_VAR_START_DELIMITER;
          }
        case 57: break;
        case 4: 
          { yybegin(YYINITIAL); return TokenType.WHITE_SPACE;
          }
        case 58: break;
        case 15: 
          { yybegin(SS_WITH_DELIMITER); return checkVariable(SilverStripeTypes.SS_VAR, SilverStripeTypes.SS_BAD_VAR);
          }
        case 59: break;
        case 10: 
          { yybegin(SS_BLOCK_VAR); return checkBlockVariable(SilverStripeTypes.SS_BLOCK_VAR, SilverStripeTypes.SS_BAD_VAR);
          }
        case 60: break;
        case 7: 
          { yybegin(SS_BAD_BLOCK_STATEMENT); yypushback(1);
          }
        case 61: break;
        case 13: 
          { yybegin(SS_IF_STATEMENT); return SilverStripeTypes.SS_COMPARISON_OPERATOR;
          }
        case 62: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
