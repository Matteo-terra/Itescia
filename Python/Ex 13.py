def main():

    nb1 = int(input("Veuillez saisir un nombre : "))
    nb2 = int(input("Veuillez saisir un second nombre : "))
    Reste = nb1 % nb2 
    quotient = nb1 // nb2 
    print("Le quotient de la division euclidienne de", nb1 ,"par", nb2 ,"est",quotient,"le reste est",Reste)


if __name__ == '__main__':
    main()
