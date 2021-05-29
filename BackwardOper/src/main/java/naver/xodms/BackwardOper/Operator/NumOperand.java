package naver.xodms.BackwardOper.Operator;

import naver.xodms.BackwardOper.Operator.ABS_CalMember;

/*
* 피연산자 클래스.
*/
public class NumOperand extends ABS_CalMember
{// 숫자 피연산자.
private int value;
public NumOperand(int v)
{
this.value = v;
}
public int getValue()
{
return this.value;
}
@Override public String toString() { return String.valueOf(this.value); }
}