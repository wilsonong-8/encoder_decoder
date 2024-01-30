## Encoder Program

###### Files can be found in src folder, Run program with Main

###
#### KeyTable Class 
* A Char Array with 44 characters mapped to default index. It is used to return Characters by Index Values using O(1) Time.
* A HashMap with Characters as Keys and Index Numbers as Values. It is used to return Index Values by Characters using O(1) Time.

###
#### Encoder Class 
* KeyTable Class used for search functions
* String ENCODE and DECODE to differentiate when using convertCharByOffsetValue function
####
* public String encode takes in a String as Argument, changes it to upperCase, generates a random Offset Value between 0-43 to find the Offset Character. It then uses the Offset Value to convert the plaintext into encodedText.
* public String decode takes in a String as Argument, changes it to upperCase, finds the Offset Value based on the first Character of the argument. Then uses the Offset value to find the initial value and thereby converting the encodedText back to plainText.
* public char convertCharByOffsetValue consists of a refactored code that is shared between encode and decode, it is used in the For Loop and takes in 3 arguments (char c,int offsetValue,String function). It will convert a Character by Encoding and Decoding depending on the (String function) argument. Any character that is not part of the 44 characters in the HashMap will be returned as the original character.

###
#### Main Class 
* Program can run from Main. Everytime the program runs it will run both encode and decode function.
* The encode function generate an encoded text with a random offset Character.
* The decode function will decode the encoded text into plain text.