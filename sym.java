
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

/** CUP generated class containing symbol constants. */
public class sym {
  /* terminals */
  public static final int AT = 11;
  public static final int DOUBLEDOT = 91;
  public static final int IDENTIFIER = 104;
  public static final int GT = 83;
  public static final int LIMITED = 34;
  public static final int ARROW = 90;
  public static final int TYPE = 64;
  public static final int SUBTYPE = 59;
  public static final int ALIASED = 7;
  public static final int LEFTLABEL = 94;
  public static final int RAISE = 49;
  public static final int GET = 98;
  public static final int RENAMES = 53;
  public static final int UNTIL = 65;
  public static final int ASSIGNMENT = 93;
  public static final int ELSIF = 22;
  public static final int COMMA = 79;
  public static final int TERMINATE = 62;
  public static final int LT = 84;
  public static final int ALL = 8;
  public static final int INTEGER = 100;
  public static final int DECLARE = 16;
  public static final int ABORT = 2;
  public static final int PUT = 97;
  public static final int ACCESS = 6;
  public static final int LOOP = 35;
  public static final int PROTECTED = 48;
  public static final int OUT = 43;
  public static final int INTEGER_LITERAL = 105;
  public static final int NOT = 38;
  public static final int TASK = 61;
  public static final int ARRAY = 10;
  public static final int FLOAT = 101;
  public static final int THEN = 63;
  public static final int GOTO = 30;
  public static final int PACKAGE = 44;
  public static final int RECORD = 51;
  public static final int REVERSE = 56;
  public static final int BOOLEAN_LITERAL = 109;
  public static final int MOD = 36;
  public static final int WHEN = 67;
  public static final int OR_ELSE = 103;
  public static final int GENERIC = 29;
  public static final int DIGITS = 19;
  public static final int MULTIPLY = 75;
  public static final int SELECT = 57;
  public static final int OTHERS = 42;
  public static final int ABSTRACT = 4;
  public static final int VERTICAL_LINE = 89;
  public static final int PLUS = 77;
  public static final int DIVIDE = 76;
  public static final int EQUAL = 85;
  public static final int RIGHTPAR = 74;
  public static final int WHILE = 68;
  public static final int USE = 66;
  public static final int INEQUALITY = 86;
  public static final int AND_THEN = 102;
  public static final int BOOLEAN = 99;
  public static final int DO = 20;
  public static final int FOR = 27;
  public static final int CONCATENATE = 71;
  public static final int RETURN = 55;
  public static final int DELAY = 17;
  public static final int ELSE = 21;
  public static final int GTEQ = 87;
  public static final int POINT = 80;
  public static final int PROCEDURE = 47;
  public static final int ENTRY = 24;
  public static final int DELTA = 18;
  public static final int PRAGMA = 45;
  public static final int STRING_LITERAL = 108;
  public static final int TICK = 72;
  public static final int NULL = 39;
  public static final int BOX = 96;
  public static final int SEMICOLON = 82;
  public static final int EOF = 0;
  public static final int FUNCTION = 28;
  public static final int RIGHTLABEL = 95;
  public static final int MINUS = 78;
  public static final int LEFTPAR = 73;
  public static final int IS = 33;
  public static final int CONSTANT = 15;
  public static final int LTEQ = 88;
  public static final int BODY = 13;
  public static final int ACCEPT = 5;
  public static final int IN = 32;
  public static final int OR = 41;
  public static final int error = 1;
  public static final int EXIT = 26;
  public static final int IF = 31;
  public static final int OF = 40;
  public static final int ABS = 3;
  public static final int END = 23;
  public static final int COLON = 81;
  public static final int REM = 52;
  public static final int REQUEUE = 54;
  public static final int SEPARATE = 58;
  public static final int CHARACTER_LITERAL = 107;
  public static final int BEGIN = 12;
  public static final int CASE = 14;
  public static final int EXCEPTION = 25;
  public static final int NEW = 37;
  public static final int TAGGED = 60;
  public static final int EXPONENTIATE = 92;
  public static final int RANGE = 50;
  public static final int AND = 9;
  public static final int PRIVATE = 46;
  public static final int WITH = 69;
  public static final int XOR = 70;
  public static final int FLOATING_POINT_LITERAL = 106;
  public static final String[] terminalNames = new String[] {
  "EOF",
  "error",
  "ABORT",
  "ABS",
  "ABSTRACT",
  "ACCEPT",
  "ACCESS",
  "ALIASED",
  "ALL",
  "AND",
  "ARRAY",
  "AT",
  "BEGIN",
  "BODY",
  "CASE",
  "CONSTANT",
  "DECLARE",
  "DELAY",
  "DELTA",
  "DIGITS",
  "DO",
  "ELSE",
  "ELSIF",
  "END",
  "ENTRY",
  "EXCEPTION",
  "EXIT",
  "FOR",
  "FUNCTION",
  "GENERIC",
  "GOTO",
  "IF",
  "IN",
  "IS",
  "LIMITED",
  "LOOP",
  "MOD",
  "NEW",
  "NOT",
  "NULL",
  "OF",
  "OR",
  "OTHERS",
  "OUT",
  "PACKAGE",
  "PRAGMA",
  "PRIVATE",
  "PROCEDURE",
  "PROTECTED",
  "RAISE",
  "RANGE",
  "RECORD",
  "REM",
  "RENAMES",
  "REQUEUE",
  "RETURN",
  "REVERSE",
  "SELECT",
  "SEPARATE",
  "SUBTYPE",
  "TAGGED",
  "TASK",
  "TERMINATE",
  "THEN",
  "TYPE",
  "UNTIL",
  "USE",
  "WHEN",
  "WHILE",
  "WITH",
  "XOR",
  "CONCATENATE",
  "TICK",
  "LEFTPAR",
  "RIGHTPAR",
  "MULTIPLY",
  "DIVIDE",
  "PLUS",
  "MINUS",
  "COMMA",
  "POINT",
  "COLON",
  "SEMICOLON",
  "GT",
  "LT",
  "EQUAL",
  "INEQUALITY",
  "GTEQ",
  "LTEQ",
  "VERTICAL_LINE",
  "ARROW",
  "DOUBLEDOT",
  "EXPONENTIATE",
  "ASSIGNMENT",
  "LEFTLABEL",
  "RIGHTLABEL",
  "BOX",
  "PUT",
  "GET",
  "BOOLEAN",
  "INTEGER",
  "FLOAT",
  "AND_THEN",
  "OR_ELSE",
  "IDENTIFIER",
  "INTEGER_LITERAL",
  "FLOATING_POINT_LITERAL",
  "CHARACTER_LITERAL",
  "STRING_LITERAL",
  "BOOLEAN_LITERAL"
  };
}
