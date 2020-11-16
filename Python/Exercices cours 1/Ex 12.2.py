def main():
    
    nb = 1
    a = 0 
    résultat = 0
    while a <= 9 :
        while nb <= 10 :
            résultat = a * nb
            print( a ,"x" , nb ,"=",résultat)
            nb = nb + 1
        a = a + 1
        nb = 0
        print("------------")


if __name__ == '__main__':
    main()