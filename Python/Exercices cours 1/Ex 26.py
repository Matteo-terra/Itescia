def main():
    
    s = input("Tapez une chaine de caractères s : ")
    s = s.split()
    for x in s:
      if(x[0] == 'a'):
           print("Le mot : ", x, " commence par la lettre 'a'")


if __name__ == '__main__':
    main()
