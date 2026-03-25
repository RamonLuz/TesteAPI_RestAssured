# language: pt

Funcionalidade: Buscar posts

Cenário: Buscar post por ID
  Quando eu busco o post 1
  Então o status code deve ser 200
  E o id retornado deve ser 1
  
Cenário: Buscar post por id 
  Quando eu busco o get "10"
  Então o status code deve ser 200
    E o id retornado deve ser 10
  
Cenário: Buscar post por id nao encontrado
  Quando eu busco o get 9999
  Então o status code deve ser 404
  
Cenário: Buscar post por id invalido 
  Quando eu busco o get "dez"
  Então o status code deve ser 404