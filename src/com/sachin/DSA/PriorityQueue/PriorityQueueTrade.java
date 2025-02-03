package com.sachin.DSA.PriorityQueue;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueTrade
{
    TradeComparator tc = new TradeComparator();
    PriorityQueue<TradeBuySell> tradeQueue = new PriorityQueue<TradeBuySell>(10, tc);

    void addTrades()
    {
        tradeQueue.add(new TradeBuySell(1, "Buy", "MSFT", 400, 10));
        tradeQueue.add(new TradeBuySell(2, "Buy", "NVDA", 100, 11));
        tradeQueue.add(new TradeBuySell(4, "Buy", "MSFT", 410, 12));
        tradeQueue.add(new TradeBuySell(5, "Buy", "NVDA", 110, 13));
        tradeQueue.add(new TradeBuySell(6, "Buy", "AAPL", 200, 14));
        tradeQueue.add(new TradeBuySell(3, "Buy", "AAPL", 210, 15));
    }

    void displayPQ()
    {
        Iterator<TradeBuySell> it = tradeQueue.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args)
    {
        PriorityQueueTrade trade = new PriorityQueueTrade();
        trade.addTrades();
        trade.displayPQ();
    }
}
