package ordenador;

import java.util.HashMap;
import java.util.List;

import modelo.Territorio;

public class TerritorioM implements Comparable<TerritorioM>{

	private Territorio territorio;
	private int victoria=0;
	private int indexAtaque=0;
	private int requerimiento=0;
	private int indexTransferencia=0;
	
	
	public TerritorioM(Territorio territorio)
	{
		this.territorio=territorio;
		this.victoria=victoriaA(territorio);
	}

	@Override
	public int compareTo(TerritorioM o) {
		if (victoria > o.victoria) {
            return -1;
        }
        else {
            return 1;
        }
	}
	//Define la mejor posibilidad de victoria
	public int victoriaA(Territorio t)
	{
		int mejorDiferencia=0;
		int diferencia=0;
		for (int i=0;i<t.getVecinos().size();i++)
		{
			if(t.getVecinos().get(i).getPertenece()=='r')
			{
				diferencia=this.territorio.getSoldados()-t.getVecinos().get(i).getSoldados();
				
				if(diferencia>mejorDiferencia)
					{
					mejorDiferencia=diferencia;							;
					}
				indexAtaque=i;
			}
		}
		return mejorDiferencia;
	}

	public Territorio getTerritorio() {
		return territorio;
	}

	public void setTerritorio(Territorio territorio) {
		this.territorio = territorio;
	}

	public int getVictoria() {
		return victoria;
	}

	public void setVictoria(int victoria) {
		this.victoria = victoria;
	}

	public int getIndexAtaque() {
		return indexAtaque;
	}

	public void setIndexAtaque(int indexAtaque) {
		this.indexAtaque = indexAtaque;
	}

	public int getRequerimiento() {
		return requerimiento;
	}

	public void setRequerimiento(int requerimiento) {
		this.requerimiento = requerimiento;
	}

	public int getIndexTransferencia() {
		return indexTransferencia;
	}

	public void setIndexTransferencia(int indexTransferencia) {
		this.indexTransferencia = indexTransferencia;
	}

	@Override
	public String toString() {
		return "TerritorioM [territorio=" + territorio + ", victoria=" + victoria + ", indexAtaque=" + indexAtaque
				+ ", requerimiento=" + requerimiento + ", indexTransferencia=" + indexTransferencia + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public int mejorT(Territorio t)
	{
		int mejorCalificacion=0;
		int calificacion=0;
		for (int i=0;i<t.getVecinos().size();i++){
			=this.territorio.getSoldados()-t.getVecinos().get(i).getSoldados();
			if(diferencia>mejorDiferencia)
			{
				mejorDiferencia=t.getVecinos().get(i).getSoldados()-this.territorio.getSoldados();
				this.indexTransferencia=i;
			}
		}
		return mejorDiferencia;
	}
	/*
	public HashMap<Integer, Territorio> crearHashMap(List<Estudiante> lista) {
		
		HashMap<Integer, Estudiante> hMap = new HashMap<Integer, Estudiante>();
		
		for (Estudiante e : lista) {
			hMap.put(e.getIndentificacion(), e);
		}
		
		return hMap;
		
	}*/
}