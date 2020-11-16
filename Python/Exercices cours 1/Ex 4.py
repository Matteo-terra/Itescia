def main():

    nb = input("Veuillez saisir un nombre entier : ")
    if int(nb) % 2 == 0 :
        print("Le nombre",nb,"est pair")
    else :
        print("Le nombre",nb,"est impair")


if __name__ == '__main__':
    main()
    