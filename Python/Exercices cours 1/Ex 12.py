def main():
    
    nb = int(input("Veuillez saisir un nombre : "))
    a = 0 
    résultat = 0
    while a <= nb :
        résultat = a * nb
        print( a ,"x" , nb ,"=",résultat)
        a=a+1


if __name__ == '__main__':
    main()