def main():
    
    vowels = {'a','e','y','u','i','o'}
    s = "anticonstitutionellement"
    n = len(s)
    vowels_number = 0
    for i in range(0,n):
      if(s[i] in vowels):
            vowels_number = vowels_number + 1
    print("Le nombre de voyelles de la chaine 's' est : ", vowels_number)


if __name__ == '__main__':
        main()

