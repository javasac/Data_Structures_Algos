package com.sachin.DSA.PriorityQueue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

public class PriorityQueueTrade
{
    HashMap<String, PriorityQueue<TradeBuySell>> hm = new HashMap<>();
    TradeComparator tc = new TradeComparator();
    PriorityQueue<TradeBuySell> tradeQueue = new PriorityQueue<TradeBuySell>(1, tc);

    void addTrades()
    {
        tradeQueue = new PriorityQueue<TradeBuySell>(1, tc);
        tradeQueue.add(new TradeBuySell(1, "Buy", "MSFT", 400, 10));
        hm.put("MSFT", tradeQueue);

        tradeQueue = new PriorityQueue<TradeBuySell>(1, tc);
        tradeQueue.add(new TradeBuySell(2, "Buy", "NVDA", 110, 6));
        hm.put("NVDA", tradeQueue);

        tradeQueue = new PriorityQueue<TradeBuySell>(1, tc);
        tradeQueue.add(new TradeBuySell(3, "Buy", "MSFT", 412, 3));
        hm.put("MSFT", tradeQueue);

        /*tradeQueue.add(new TradeBuySell(1, "Buy", "MSFT", 400, 10));
        tradeQueue.add(new TradeBuySell(2, "Buy", "NVDA", 100, 11));
        tradeQueue.add(new TradeBuySell(3, "Buy", "MSFT", 410, 12));
        tradeQueue.add(new TradeBuySell(4, "Buy", "NVDA", 110, 13));
        tradeQueue.add(new TradeBuySell(5, "Buy", "AAPL", 200, 14));
        tradeQueue.add(new TradeBuySell(6, "Buy", "AAPL", 210, 15));*/
    }

    void displayPQ()
    {
        for (Map.Entry<String, PriorityQueue<TradeBuySell>> entry : hm.entrySet())
        {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    public static void main(String[] args)
    {
        PriorityQueueTrade trade = new PriorityQueueTrade();
        trade.addTrades();
        trade.displayPQ();
    }
}
