package com.LeetCode.code.q460.LFUCache;
/**
 * @QuestionId	:	460
 * @difficulty	:	Hard
 * @Title	 	:	LFU Cache
 * @TranslatedTitle:LFU缓存
 * @url			:	https://leetcode-cn.com/problems/lfu-cache/
 * @TranslatedContent:设计并实现<a href="https://baike.baidu.com/item/%E7%BC%93%E5%AD%98%E7%AE%97%E6%B3%95">最不经常使用（LFU）缓存的数据结构。它应该支持以下操作：get 和 put。
	
	get(key) - 如果键存在于缓存中，则获取键的值（总是正数），否则返回 -1。<br />
	put(key, value) - 如果键不存在，请设置或插入值。当缓存达到其容量时，它应该在插入新项目之前，使最不经常使用的项目无效。在此问题中，当存在平局（即两个或更多个键具有相同使用频率）时，最近最少使用的键将被去除。
	
	进阶：<br />
	你是否可以在 O(1) 时间复杂度内执行两项操作？
	
	示例：
	
	
	LFUCache cache = new LFUCache( 2 /* capacity (缓存容量) */ );
	
	cache.put(1, 1);
	cache.put(2, 2);
	cache.get(1);       // 返回 1
	cache.put(3, 3);    // 去除 key 2
	cache.get(2);       // 返回 -1 (未找到key 2)
	cache.get(3);       // 返回 3
	cache.put(4, 4);    // 去除 key 1
	cache.get(1);       // 返回 -1 (未找到 key 1)
	cache.get(3);       // 返回 3
	cache.get(4);       // 返回 4
	
 */
class LFUCache {

    public LFUCache(int capacity) {
        
    }
    
    public int get(int key) {
        
    }
    
    public void put(int key, int value) {
        
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */