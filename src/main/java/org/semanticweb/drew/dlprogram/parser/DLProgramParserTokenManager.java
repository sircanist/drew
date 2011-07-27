/* Generated By:JavaCC: Do not edit this line. DLProgramParserTokenManager.java */
package org.semanticweb.drew.dlprogram.parser;
import org.semanticweb.drew.dlprogram.model.*;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.semanticweb.owlapi.model.OWLLogicalEntity;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.IRI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Token Manager. */
public class DLProgramParserTokenManager implements DLProgramParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x4080L) != 0L)
         {
            jjmatchedKind = 21;
            return 31;
         }
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 17;
            return 32;
         }
         if ((active0 & 0x30c00000L) != 0L)
            return 13;
         return -1;
      case 1:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 1;
            return 32;
         }
         if ((active0 & 0x80L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 1;
            return 31;
         }
         if ((active0 & 0x4000L) != 0L)
            return 31;
         return -1;
      case 2:
         if ((active0 & 0x80L) != 0L)
         {
            jjmatchedKind = 21;
            jjmatchedPos = 2;
            return 31;
         }
         if ((active0 & 0x40L) != 0L)
            return 32;
         return -1;
      case 3:
         if ((active0 & 0x80L) != 0L)
            return 31;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 35:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 40:
         return jjStopAtPos(0, 26);
      case 41:
         return jjStopAtPos(0, 27);
      case 42:
         return jjStopAtPos(0, 24);
      case 43:
         jjmatchedKind = 22;
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 44:
         return jjStopAtPos(0, 9);
      case 45:
         jjmatchedKind = 23;
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 46:
         return jjStopAtPos(0, 12);
      case 47:
         return jjStopAtPos(0, 25);
      case 58:
         jjmatchedKind = 11;
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 59:
         return jjStopAtPos(0, 31);
      case 68:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 91:
         return jjStopAtPos(0, 15);
      case 93:
         return jjStopAtPos(0, 16);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x40L);
      case 123:
         return jjStopAtPos(0, 32);
      case 125:
         return jjStopAtPos(0, 33);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 45:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(1, 10);
         break;
      case 61:
         if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(1, 28);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(1, 29);
         break;
      case 76:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(1, 14, 31);
         break;
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x80L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 116:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(2, 6, 32);
         break;
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(3, 7, 31);
         break;
      case 109:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 115:
         return jjMoveStringLiteralDfa6_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 112:
         return jjMoveStringLiteralDfa7_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa8_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa9_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(9, 8);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 31;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 32:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                     jjCheckNAdd(24);
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 17)
                        kind = 17;
                     jjCheckNAdd(11);
                  }
                  break;
               case 31:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                     jjCheckNAdd(24);
                  }
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 21)
                        kind = 21;
                     jjCheckNAdd(22);
                  }
                  break;
               case 0:
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 18)
                        kind = 18;
                     jjCheckNAddStates(0, 2);
                  }
                  else if ((0x7000000000000000L & l) != 0L)
                  {
                     if (kind > 13)
                        kind = 13;
                  }
                  else if ((0x280000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 13;
                  else if (curChar == 48)
                  {
                     if (kind > 18)
                        kind = 18;
                     jjCheckNAdd(26);
                  }
                  else if (curChar == 34)
                     jjCheckNAddStates(3, 5);
                  else if (curChar == 33)
                     jjCheckNAdd(6);
                  else if (curChar == 37)
                     jjCheckNAddStates(6, 8);
                  if (curChar == 60)
                     jjCheckNAdd(6);
                  else if (curChar == 62)
                     jjCheckNAdd(6);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(6, 8);
                  break;
               case 2:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 3:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 4:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 5:
                  if ((0x7000000000000000L & l) != 0L && kind > 13)
                     kind = 13;
                  break;
               case 6:
                  if (curChar == 61 && kind > 13)
                     kind = 13;
                  break;
               case 7:
                  if (curChar == 62)
                     jjCheckNAdd(6);
                  break;
               case 8:
                  if (curChar == 60)
                     jjCheckNAdd(6);
                  break;
               case 9:
                  if (curChar == 33)
                     jjCheckNAdd(6);
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  jjCheckNAdd(11);
                  break;
               case 12:
                  if ((0x280000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 13:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAdd(14);
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAdd(14);
                  break;
               case 15:
                  if (curChar == 34)
                     jjCheckNAddStates(3, 5);
                  break;
               case 16:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(3, 5);
                  break;
               case 18:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(3, 5);
                  break;
               case 19:
                  if (curChar == 34 && kind > 20)
                     kind = 20;
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAdd(22);
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAdd(24);
                  break;
               case 25:
                  if (curChar != 48)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAdd(26);
                  break;
               case 26:
                  if (curChar == 46)
                     jjCheckNAddTwoStates(27, 28);
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(27, 28);
                  break;
               case 28:
                  if ((0x3fe000000000000L & l) != 0L && kind > 19)
                     kind = 19;
                  break;
               case 29:
                  if ((0x3fe000000000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjCheckNAddStates(0, 2);
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(30, 26);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 32:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                     jjCheckNAdd(24);
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 17)
                        kind = 17;
                     jjCheckNAdd(11);
                  }
                  break;
               case 31:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                     jjCheckNAdd(24);
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 21)
                        kind = 21;
                     jjCheckNAdd(22);
                  }
                  break;
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 30)
                        kind = 30;
                     jjCheckNAdd(24);
                  }
                  else if (curChar == 95)
                  {
                     if (kind > 21)
                        kind = 21;
                  }
                  if ((0x7fffffeL & l) != 0L)
                  {
                     if (kind > 21)
                        kind = 21;
                     jjCheckNAdd(22);
                  }
                  else if ((0x7fffffe00000000L & l) != 0L)
                  {
                     if (kind > 17)
                        kind = 17;
                     jjCheckNAdd(11);
                  }
                  break;
               case 1:
                  jjAddStates(6, 8);
                  break;
               case 10:
                  if ((0x7fffffe00000000L & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  jjCheckNAdd(11);
                  break;
               case 11:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  jjCheckNAdd(11);
                  break;
               case 16:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(3, 5);
                  break;
               case 17:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 18:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(3, 5);
                  break;
               case 20:
                  if (curChar == 95 && kind > 21)
                     kind = 21;
                  break;
               case 21:
                  if ((0x7fffffeL & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAdd(22);
                  break;
               case 22:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 21)
                     kind = 21;
                  jjCheckNAdd(22);
                  break;
               case 23:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAdd(24);
                  break;
               case 24:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 30)
                     kind = 30;
                  jjCheckNAdd(24);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(6, 8);
                  break;
               case 16:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(3, 5);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 31 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   14, 30, 26, 16, 17, 19, 1, 2, 4, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, "\156\157\164", "\124\162\165\145", 
"\43\156\141\155\145\163\160\141\143\145", "\54", "\72\55", "\72", "\56", null, "\104\114", "\133", "\135", null, null, 
null, null, null, "\53", "\55", "\52", "\57", "\50", "\51", "\53\75", "\55\75", null, 
"\73", "\173", "\175", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x3ffffffc1L, 
};
static final long[] jjtoSkip = {
   0x3eL, 
};
protected JavaCharStream input_stream;
private final int[] jjrounds = new int[31];
private final int[] jjstateSet = new int[62];
protected char curChar;
/** Constructor. */
public DLProgramParserTokenManager(JavaCharStream stream){
   if (JavaCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public DLProgramParserTokenManager(JavaCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(JavaCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 31; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(JavaCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
