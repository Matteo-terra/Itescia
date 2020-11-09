def main():
    
    message = input("Veuillez saisir un message : ")
    i = len(message)
    first = message[0]
    last = message[i - 1]
    message = message[1 : i - 1]
    result = last + message + first
    print(result)


if __name__ == '__main__':
    main()
