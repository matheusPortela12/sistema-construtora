fun main(args: Array<String>){
    //Instância da Obra
    var obraUnifeob = Obra("Unifeob")

    //Instância das Locações
    var betoneira = Equipamento("Betoneira",25)
    var trator = Equipamento("Trator",15)
    var pa = Equipamento("Pá",2)

    var trabalhoBetoneira = TrabalhoDoEquipamento(betoneira,10)
    var trabalhoTrator = TrabalhoDoEquipamento(trator,5)
    var trabalhoPa = TrabalhoDoEquipamento(pa,2)

    //Instâncias dos Insumos
    var areia = Insumo("Areia",15)
    var cimento = Insumo("Cimento",50)
    var cal = Insumo("Cal",20)

    //Instância dos insumos consumidos
    var consumoAreia = InsumoConsumido(areia,25)
    var consumoCimento = InsumoConsumido(cimento,10)
    var consumoCal = InsumoConsumido(cal,20)

    //Instâncias da Mão de Obra
    var pedreiro1 = MaoDeObra("Pedreiro 1",10)
    var pedreiro2 = MaoDeObra("Pedreiro 2",6)
    var pedreiro3 = MaoDeObra("Pedreiro 3",15)

    //Instâncias do uso da Mão de Obra
    var trabalhoPedreiro1 = TrabalhoMaoDeObra(pedreiro1,8)
    var trabalhoPedreiro2 = TrabalhoMaoDeObra(pedreiro2,10)
    var trabalhoPedreiro3 = TrabalhoMaoDeObra(pedreiro3,5)

    //Atribuição dos insumos consumidos a obra
    obraUnifeob.temInsumo(consumoAreia)
    obraUnifeob.temInsumo(consumoCimento)
    obraUnifeob.temInsumo(consumoCal)

    //Atribuição dos trabalhadores usados a obra
    obraUnifeob.temTrabalhadores(trabalhoPedreiro1)
    obraUnifeob.temTrabalhadores(trabalhoPedreiro2)
    obraUnifeob.temTrabalhadores(trabalhoPedreiro3)

    //Atribuição dos equipamentos que trabalharam a obra
    obraUnifeob.usouEquipamento(trabalhoBetoneira)
    obraUnifeob.usouEquipamento(trabalhoTrator)
    obraUnifeob.usouEquipamento(trabalhoPa)

    println("Obra sendo iniciada na: ${obraUnifeob.nome}")
    println("Os gastos totais com Insumos é de R$ ${obraUnifeob.gastosTotaisComInsumos()}")
    println("Os gastos totais com Mão de Obra é de R$ ${obraUnifeob.gastosTotaisComMaoDeObra()}")
    println("Os gastos totais com Equipamentos é de R$ ${obraUnifeob.gastosTotaisComEquipamento()}")
    println("Os gastos totais da Obra é de R$ ${obraUnifeob.gastosTotaisObra()}")
}