public class GroceryList {
    private String[] arr;
//given code:
    public GroceryList() {
        // our grocery list will have a max size of 10
        this.arr = new String[10]; 
    }

    public void add(String item) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = item;
                break;
            }
        }
    }
    public void remove(String item){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                arr[i] = " ";
                break;
            }
    }
}
    public String toString(){
        String str = this.arr[0] + " " + this.arr[1] + " " + this.arr[2] + " " + this.arr[3] + " "+ this.arr[4] + " " + this.arr[5] + " " + this.arr[6] + " " + this.arr[7] + " " + this.arr[8] + " " + this.arr[9];
        return str;
    }
}   
//Note: I'm not sure why the code is printing out the string "null" instead of a blank space. Otherwise,
//everything else seems to be working fine.