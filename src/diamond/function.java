/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diamond;

/**
 *
 * @author JoséFrancisco
 */
public class function {
    
    public void createDiamond(String word)
    {
        String row          = "",
               array_word[] = word.split(""),
               space        = " ",
               newWord      = "";
        
        int length_word = word.length(),
            aux         = length_word - 1;
        
        
        System.out.println("");
        for ( int i = 0 ; i < length_word ; i ++  )
        {
            int aux2     = length_word - 1 - aux;
            int numSpace = 0 ;
            
            for ( int j = 0 ; j <= aux2 ; j ++ )
            {
                row += array_word[j];
                if ( j == aux2 )
                {
                    while ( numSpace < aux )
                    {
                        row += space;
                        numSpace ++ ;

                    }

                    String array_double[] = row.split("");
                    
                    for ( int k = array_double.length - 1 ; k > 0 ; k -- )
                    {
                        newWord += array_double[k];
                    }
                    newWord += row;
                }
            }
            
            System.out.println(newWord);
            row     = "";
            newWord = "";
            aux -- ; 
        }
        
        for ( int i = length_word - 1 ; i > 0 ; i -- )
        {
            array_word[i] = " ";
            
            for ( int k = length_word - 1 ; k > 0 ; k -- )
            {
                newWord += array_word[k];
            }
            for ( int j = 0 ; j < length_word ; j ++ )
            {
                newWord += array_word[j];
            }
            System.out.println(newWord);
            newWord = "";
        }
        
        
    }
    
}
