def main():

    message = input("Veuillez saisir un message : ")
    lettre  = input("Veuillez saisir le caractère à chercher : ")
    i = len(message)
    for i in range(0 , i):
        if message[i] == lettre :
            print("Le caractère", lettre, "se trouve à la position : ", i)

if __name__ == '__main__':
    main()
    