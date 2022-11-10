**Part 1**

Task picked: 

    In DocSearchServer.java, change the name of the start parameter of getFiles, and all of its uses, to instead be called base.

Shortest Sequence of vim commands: 

1. vim DocSearchServer.java
2. < Enter >

    ![vim](1.1.PNG)
    This allow us to enter the DocSearchServer.java file in vim mode ready for edit 

3.  /start (6 keys pressed)

    ![search](1.2.PNG)
    This step help tp find the first "start" that is in the file that we need to change to be "base"

4. < Enter > (1 key pressed)

    ![search](1.2.1.PNG)
    After hitting enter, the cursor will automatically be at the begining of the word that we are trying to find

5. dw (2 keys pressed)

    ![dw](1.3.PNG)
    dw will delete the whole word as the cursor was moved to the begining of "start" 

6. i (1 key pressed)

    ![i](1.4.PNG)
    pressing "i" will allow us to enter insert mode, allowing us to insert new word, such as "base", to replace the deleted word

7. type "base" 
8. < Esc > (1-key press)

    ![base](1.5.PNG)
    type "base" as it's the desire word we want to replace "start" with then press esc will confirm the insert of the word while exiting out of insert mode 

9. n (1 key pressed)

    ![n](1.6.PNG)
    pressing "n" repeat the same command that we did before, which is "/start" and it will jump to the next "start" that we need to edit 

10. repeat step 5 - 8 to change "start" to "base" again (dw > i > "base" > < Esc >)

    ![5-8](1.7.PNG)
    (4 keys pressed)

11. n (1 key pressed)

    ![n](1.8.PNG)
    Find the next "start" that needs to be change to "base" in the getFiles method 

12. repeat step 5 - 8 to change "start" to "base" again (dw > i > "base" > < Esc >)

    ![5-8](1.9.PNG)
    (4 keys pressed)

13. n (1 key press)

    ![n](1.10.PNG)
    It finds another "start" but this "start" is not in the getFiles method, hence, we don't need to change it to base. This mean that we have changed all the "start" in the getFiles method to "base" and our task is completed 

14. :wq (3 keys pressed)
15. < Enter > (1 key pressed)

    ![save](1.11.PNG)
    :wq and < Enter > will save the changes on the files and exit out of vim 
    

**Total Key Pressed: 26 keys pressed for vim commands**


**Part 2**
