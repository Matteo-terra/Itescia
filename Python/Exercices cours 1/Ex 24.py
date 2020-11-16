def main():
    
    mot = input("Saisir un mot : ")
    inverse = mot[::-1]
    if(mot == inverse):
       print("Le mot :", mot," est un palindrome")
    else:
       print("Le mot : ", mot, " n'est pas un palindrome")


if __name__ == '__main__':
    main()
