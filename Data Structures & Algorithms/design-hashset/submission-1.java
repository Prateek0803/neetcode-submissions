class MyHashSet {
    private int[] bucket;
    private int size;
    public MyHashSet() {
        this.bucket = new int[0];
        this.size = 0;
    }
    
    public void add(int key) {
         int[] newArray = new int[this.size + 1];
        if(this.bucket.length == 0){
            newArray[0] = key;
            this.size += 1;
            this.bucket = newArray;
        }

        if(!this.contains(key)){
            for(int i=0; i < this.size; i++){
                newArray[i] = this.bucket[i];
            }
            newArray[this.size] = key;
            this.size += 1;
            this.bucket = newArray;
        }else{
            return;
        }
    }
    
    public void remove(int key) {
       if(this.size == 0) return;
        if(this.contains(key)){
            int j = 0;
            int[] newArray = new int[this.size-1];
            for(int i=0; i<bucket.length; i++){
                if(this.bucket[i] != key){
                    newArray[j++] = this.bucket[i];
                }
            }
            this.size -=1;
            this.bucket = newArray;

        }else{
            return;
        }
    }
    
    public boolean contains(int key) {
         if(this.bucket.length == 0) return false;
        for(int i=0; i<this.bucket.length; i++){
            if(this.bucket[i] == key){
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */