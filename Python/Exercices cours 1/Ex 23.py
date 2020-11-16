def main():


    fichier = input("Saisir le nom du fichier avec son extension: ")
    L = fichier.split(".")
    extensionFichier = "."+ L[-1]
    print("L'extension du fichier est : ", extensionFichier)



if __name__ == '__main__':
    main()
