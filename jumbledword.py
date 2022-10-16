# Python game to guess the jumbled word. Player who guesses more correct words obviously wins 
import random

# choose function contains a collection of words that are to be jumbled
def choose():
    words=["HOSPITAL","COMPUTER","PERSON","LOVE","WOMEN","BIOLOGY","SCIENCE","HISTORY","CHEMISTRY","MATHS","OOPS","STATISTICS"]
    pick=random.choice(words)
    return pick

# jumble function taken chosen word from choose function and jumbles it using concept of permutation
def jumble(word):
    jumbled="".join(random.sample(word, len(word)))
    return jumbled

def thank(p1n,p2n,p1s,p2s):
    print("THANKS FOR PLAYING THE GAME", p1n, p2n)
    print("YOUR FINAL SCORES ARE AS: ")
    print(p1n,":", p1s)
    print(p2n,":", p2s)

def play():
    pl1name=input("PLAYER1, PLEASE ENTER YOUR NAME: ")
    pl2name=input("PLAYER2, PLEASE ENTER YOUR NAME: ")
    pp1=0
    pp2=0
    turn=0
    while(1):
        picked_word=choose()
        qn=jumble(picked_word)
        print(qn)
        if(turn%2==0):
            print("PLAYER1,", pl1name)
            ans=input("YOUR TURN, ANY GUESSES ON JUMBLED WORD?")
            if(ans==picked_word):
                pp1=pp1+1
                print("CONGRATS, YOU GUESSED IT RIGHT!..")
            else:
                print("BETTER LUCK NEXT TIME!..")
            c=int(input("DO YOU WANT TO CONTINUE? 0/1"))
            if(c==0):
                thank(pl1name, pl2name, pp1, pp2)
                break
        else:
            print("PLAYER2, ", pl2name)
            ans=input("YOUR TURN, ANY GUESSES ON JUMBLED WORD?")
            if(ans==picked_word):
                pp2=pp2+1
                print("CONGRATS, YOU GUESSED IT RIGHT!..")
            else:
                print("BETTER LUCK NEXT TIME!..")
            c=int(input("DO YOU WANT TO CONTINUE? 0/1"))
            if(c==0):
                thank(pl1name, pl2name, pp1, pp2)
                break
        turn=turn+1
        
play()