def main():
   
    message = input("Veuillez saisir un message : ")
    list = set({})
    for i in message:
        if i not in list :
            list.add(i)
            print("Le caractère", i, "apparait", message.count(i), "fois")

if __name__ == '__main__':
    main()
         