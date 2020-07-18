package cl.cruz.economicindicators.data.model

import cl.cruz.economicindicators.data.model.indicators.Indicator

data class UnemploymentRate(
    override val codigo: String?,
    override val nombre: String?,
    override val unidad_medida: String?,
    override val fecha: String?,
    override val valor: Double?
) : Indicator