def main():
    
    rayon = int(input("Veuillez saisir  le rayon du cercle en cm : "))
    Aire_Cercle = rayon * rayon
    Aire_Cercle = Aire_Cercle * 3.14
    print("la surface du cercle est de :", str(Aire_Cercle) +"cm²")


if __name__ == '__main__':
    main()