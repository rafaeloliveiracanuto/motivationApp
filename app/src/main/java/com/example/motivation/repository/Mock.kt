package com.example.motivation.repository

import com.example.motivation.infrastructure.MotivationConstants
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

data class Phrase (val description: String, val category: Int)

class Mock {

    private val ALL = MotivationConstants.PHRASEFILTER.ALL
    private val HAPPY = MotivationConstants.PHRASEFILTER.HAPPY
    private val MORNING = MotivationConstants.PHRASEFILTER.MORNING

    private val mListPhrases: List<Phrase> = listOf(
        Phrase("A persistência é o caminho do êxito.", HAPPY),
        Phrase("Toda ação humana, quer se torne positiva ou negativa, precisa depender de motivação.\n" +
                "\n", HAPPY),
        Phrase("No meio da dificuldade encontra-se a oportunidade.", HAPPY),
        Phrase("Eu faço da dificuldade a minha motivação. A volta por cima vem na continuação.", HAPPY),
        Phrase("A verdadeira motivação vem de realização, desenvolvimento pessoal, satisfação no trabalho e reconhecimento.", HAPPY),
        Phrase("Pedras no caminho? Eu guardo todas. Um dia vou construir um castelo.", HAPPY),
        Phrase("É parte da cura o desejo de ser curado.", HAPPY),
        Phrase("Tudo o que um sonho precisa para ser realizado é alguém que acredite que ele possa ser realizado.", HAPPY),
        Phrase("O insucesso é apenas uma oportunidade para recomeçar com mais inteligência.", HAPPY),

        Phrase("Um pequeno pensamento positivo pela manhã pode mudar todo o seu dia.", MORNING),
        Phrase("Que o dia seja leve, que a tristeza seja breve e que o dia seja feliz. Bom dia!", MORNING),
        Phrase("Pra hoje: sorrisos bobos, uma mente tranquila e um coração cheio de paz.", MORNING),
        Phrase("Independente do que estiver sentindo, levante-se, vista-se e saia para brilhar.", MORNING),
        Phrase("A cada nova manhã, nasce junto uma nova chance. Bom dia!", MORNING),
        Phrase("Bom dia! Comece o dia sorrindo. Afinal, coisa boa atrai coisa boa.", MORNING),
        Phrase("Viva cada momento, ria todos os dias, ame além das palavras... Tenha um bom dia!", MORNING)

    )

    fun getPhrase(categoryId: Int) : String {

        val filtered = mListPhrases.filter { (it.category == categoryId || categoryId == ALL) }

        val rand = Random.nextInt(filtered.size)

        return filtered[rand].description
    }
}