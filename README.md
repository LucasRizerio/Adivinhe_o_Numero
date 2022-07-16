# Adivinhe o numero

## Um Simples jogo de adivinhação em java


Gerando o número aleatório entre 1 e 100
```javascript
int num = 1 + (int)(100 * Math.random());
```

Definindo o número de vidas
```javascript
int vida = 5;
```

Loop pra chegar as opções
```javascript
for(i = 0; i < vida; i++){
            System.out.println("Adivinhe o numero: ");

            guess = sc.nextInt(); // Entrada de dados do usiario

            if(num == guess){
                System.out.println("Parabens"+"Você acertou");
                break;

            } else if(num > guess && i != vida -1){
                System.out.println("O numero é maior que: " + guess);

            } else if(num < guess && i != vida -1){
                System.out.println("O numero é menor que: "+ guess);
            }
        }
```

Aqui é quando você perde todas as suas vidas e tambem mostra o número que era
```javascript
        if (i == vida){
            System.out.println("Você perdeu todas as suas vida");
            System.out.println("O numero era "+ num);
        }
```
