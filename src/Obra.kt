class Obra(var nome: String){
    private val insumosConsumido = arrayListOf<InsumoConsumido>()
    private val trabalhadores = arrayListOf<TrabalhoMaoDeObra>()
    private val trabalhoDoEquipamento = arrayListOf<TrabalhoDoEquipamento>()

    fun temInsumo(insumoConsumido: InsumoConsumido){
        this.insumosConsumido.add(insumoConsumido)
    }

    fun temTrabalhadores(trabalhador: TrabalhoMaoDeObra){
        this.trabalhadores.add(trabalhador)
    }

    fun usouEquipamento(equipamento: TrabalhoDoEquipamento){
        this.trabalhoDoEquipamento.add(equipamento)
    }

    fun gastosTotaisComInsumos(): Int{
        var valorTotal: Int = 0
        for (insumo in insumosConsumido){
            valorTotal += insumo.insumo.preco * insumo.quantidade
        }
        return valorTotal
    }

    fun gastosTotaisComMaoDeObra(): Int{
        var valorTotal: Int = 0
        for (trabalhador in trabalhadores){
            valorTotal += trabalhador.horas * trabalhador.MaoDeObra.precoPorHora
        }
        return valorTotal
    }

    fun gastosTotaisComEquipamento(): Int{
        var valorTotal: Int = 0
        for (equipamento in trabalhoDoEquipamento){
            valorTotal += equipamento.horas * equipamento.equipamento.custo
        }
        return valorTotal
    }

    fun gastosTotaisObra(): Int{
        return gastosTotaisComInsumos() + gastosTotaisComMaoDeObra() + gastosTotaisComEquipamento()
    }
}