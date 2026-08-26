# ☕ Java Collections & Oriented Architecture

Este repositório foi criado para consolidar, praticar e documentar o gerenciamento de coleções na linguagem **Java**. O projeto aborda desde a manipulação básica de listas até estruturas complexas de conjuntos e mapas, focando em boas práticas de mercado, imutabilidade com `records` e segurança de tipo (*Type Safety*).

---

## 🛠️ Conteúdo do Repositório

O projeto está dividido em pacotes que demonstram as principais interfaces e implementações do ecossistema de Collections do Java:

### 1. Lists (`List` & `ArrayList`)
* **Gerenciamento de Fluxos Simples:** Criação de classes customizadas (ex: `ListTask`) encapsulando listas de objetos.
* **Segurança na Manipulação:** Evita o uso de tipos brutos (*raw types*), garantindo o controle estrito de tipos via Generics.

### 2. Sets (`Set`, `HashSet` & `TreeSet`)
* **Garantia de Elementos Únicos:** Uso do `HashSet` para gerenciar coleções que barram dados duplicados com alta performance.
* **Estruturação por Gavetas de Memória:** Estudo de como o Java organiza os elementos dinamicamente através da tabela hash.
* **Ordenação Automática:** Uso do `TreeSet` para manter conjuntos que já nascem e permanecem ordenados.

### 3. Maps (`Map`, `HashMap` & `TreeMap`)
* **Estrutura de Par (Chave/Valor):** Implementação de dicionários de dados indexados por IDs ou códigos únicos.
* **Iteração Eficiente:** Exemplos práticos de leitura de mapas usando loops estruturados (`entrySet`, `keySet`) e expressões funcionais de dois parâmetros (`Bi-Consumer`).

---

## 🚀 Conceitos Avançados Implementados

### 🛡️ Imutabilidade com `Records`
Substituição de classes tradicionais (*boilerplate*) por `records` (Java 16+). Os records garantem objetos 100% imutáveis, ideais para tráfego seguro de dados dentro de coleções, impedindo que atributos sejam alterados diretamente na memória sem o consentimento da estrutura (evitando objetos fantasmas no `Set`).

### 🔄 Ordenação Customizada com Classes Anônimas (`Comparator`)
O repositório demonstra como separar a "Ordem Natural" (definida via `Comparable` e `compareTo`) das "Ordenações Alternativas". 
* Implementação de métodos de ordenação dinâmicos usando **Classes Anônimas** para instanciar `new Comparator<T>()` em tempo de execução.
* Algoritmos de ordenação baseados em:
  * Ordem alfabética de strings (`compareToIgnoreCase`).
  * Ordem crescente e decrescente de números inteiros (`Integer.compare`).
* **Preservação de Dados:** Os métodos realizam cópias defensivas da lista original antes de aplicar o `.sort()`, mantendo o estado da coleção principal protegido.

---

## 💻 Exemplo de Código Destacado

Veja como a classe anônima do `Comparator` é aplicada para ordenar uma cópia da lista de forma legível e sem alterar a coleção original:

```java
public List<People> sortByAge() {
    List<People> sortedList = new ArrayList<>();
    sortedList.addAll(this.list); // Cópia defensiva
    
    sortedList.sort(new Comparator<People>(){
        @Override
        public int compare(People p1, People p2){
            // p1 representa o elemento atual, p2 o próximo elemento
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    });
    
    return sortedList;
}
```

---

## 🧠 Lições Aprendidas
1. **Referências de Memória:** Objetos de classes tradicionais agem como ponteiros. Alterar um objeto via *setter* direto de dentro de um `Set` corrompe a estrutura de gavetas do hashcode. A melhor prática para atualizar dados em conjuntos é remover o antigo e adicionar o novo.
2. **Sintaxe de Loops:** Fixação das diferenças cruciais entre a iteração de um parâmetro (Lists e Sets via `forEach` ou *Method Reference*) e a iteração de dois parâmetros (Maps via chave/valor).
