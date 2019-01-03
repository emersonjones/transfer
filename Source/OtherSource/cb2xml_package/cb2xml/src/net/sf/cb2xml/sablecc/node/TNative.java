/* This file was generated by SableCC (http://www.sablecc.org/). */

package net.sf.cb2xml.sablecc.node;

import net.sf.cb2xml.sablecc.analysis.*;

@SuppressWarnings("nls")
public final class TNative extends Token
{
    public TNative(String text)
    {
        setText(text);
    }

    public TNative(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TNative(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTNative(this);
    }
}
