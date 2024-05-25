
public class guess { 

    private long[] a; // ref to array a
private int nElems; // number of data items
//-----------------------------------------------------------
public guess(int max) // constructor
{
a = new long[max]; // create array
nElems = 0;
}
//-----------------------------------------------------------
public int size()
{ return nElems; }

    
        

    public int find(long searchkey){

        int lowerBound = 0;
        int upperBound = nElems - 1;
        int curIn;
        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if(a[curIn]==searchkey)
                return curIn;
            else if (lowerBound > upperBound)
            return nElems;
            else
            {
                if(a[curIn] < searchkey)
                lowerBound = curIn + 1;
                else
                upperBound = curIn - 1; 
            }
            
        }

    }
}
