def main():

    nb = int(input("Veuillez saisir un nombre : "))
    i = 0
    for i in range( 1 , nb + 1 ):
     if nb % i == 0 :
            i = i + 1
    if i > 2 :
      print("Votre nombre n'est pas premier")
    else:
      print("Votre nombre est premier")

if __name__ == '__main__':
    main()
    