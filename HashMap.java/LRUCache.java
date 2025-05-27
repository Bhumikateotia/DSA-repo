package HashMap.java;
class ListNode
{
    int key;
    int value;
    ListNode prev;
    ListNode next;
    public ListNode(int key,int value)
    {
        this.key=key;
        this.value=value;
        this.next=null;
        this.prev=null;
    }
}
class LRUCache {
       HashMap<Integer,ListNode> map= new HashMap<>();
        int capacity;
        ListNode head= new ListNode(-1,-1);
        ListNode tail = new ListNode(-1,-1);
    public LRUCache(int capacity) {
       this.capacity=capacity;
       head.next=tail;
       tail.prev=head;
        
    }
    void deletenode(ListNode node)
    {
        ListNode p=node.prev;
        ListNode n= node.next;
        p.next=n;
        n.prev=p;
    }
    void addfront(ListNode node)
    {
        ListNode ne= head.next;
        head.next=node;
        node.prev=head;

        node.next=ne;
        ne.prev=node;
    }
    // first we get the value of that node using the key,get
    public int get(int key) {
        if(map.containsKey(key)==true)
        {
        ListNode node = map.get(key);// get that node key
        deletenode(node);// delete that node from that place
        addfront(node);// and add that into the front next to the head
        return node.value;// and return that node value
        }
        else
        {
            return -1;
        }
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)==true)
        {
            ListNode node = map.get(key);
            node.value=value;
            deletenode(node);
            addfront(node);
            return;
        }
        ListNode newnode=new ListNode(key,value);
        if(map.size()==capacity)
        {
            ListNode node = tail.prev;
            map.remove(tail.prev.key);
            deletenode(node);
        }
        map.put(key,newnode);
        addfront(newnode);
    }
}

