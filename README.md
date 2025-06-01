![Imagem POO](https://images.unsplash.com/photo-1621839673705-6617adf9e890?ixlib=rb-4.1.0&q=85&fm=jpg&crop=entropy&cs=srgb)

# PROGRAMAÇÃO ORIENTADA A OBJETOS

---

## 🧠 Atalhos Úteis

- `Shift + F6` → Refatorar nome
- `Shift + Insert` → Criar construtores
- `Ctrl + Click` → Navegar entre atributos e métodos

---

## 🧱 Pilares da POO

1. **Abstração**
2. **Encapsulamento**
3. **Herança**
4. **Polimorfismo**

---

## 🔍 Abstração

Abstração é o primeiro conceito usado em POO. Ele consiste em simplificar a complexidade das entidades.

- **Classe**: Entidade representada no código.  
  *Exemplos:* `Pessoa`, `ContaBancaria`, `Aluno`, `Produto`.

- **Atributos**: Características da entidade.  
  *Exemplos:* `idade`, `nome`, `preco`.

- **Métodos**: Ações que a entidade pode realizar.  
  *Exemplos:* `sacar()`, `comer()`, `provas()`.

---

## 🔐 Encapsulamento e Modificadores de Acesso

O encapsulamento protege os dados internos da classe e controla como são acessados.

### Modificadores

- `private`: Visível apenas dentro da própria classe.
- `protected`: Visível no mesmo pacote ou em subclasses.
- `public`: Acesso livre a qualquer classe.
- *(default)*: Visível apenas no mesmo pacote (quando não declarado).

### Getters e Setters

```java
public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

```

