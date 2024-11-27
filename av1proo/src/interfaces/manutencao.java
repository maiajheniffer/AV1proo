package interfaces;

public interface manutencao {

		public default String realizarManutencao() {
			String manutencao_realizada = "Manutenção realizada.";
			return manutencao_realizada;
		}
}
