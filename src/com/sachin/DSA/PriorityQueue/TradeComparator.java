package com.sachin.DSA.PriorityQueue;
import java.util.Comparator;

public class TradeComparator implements Comparator<TradeBuySell>
{
    @Override
    public int compare(TradeBuySell o1, TradeBuySell o2)
    {
        return o2.getQuantity() - o1.getQuantity();
    }
}
