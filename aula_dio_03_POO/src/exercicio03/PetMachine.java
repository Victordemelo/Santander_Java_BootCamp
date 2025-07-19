package exercicio03;

public class PetMachine {
    Pet pet = new Pet();

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    private int agua;
    private int shampoo;
    private boolean maquina;
    private boolean maquinasuja;

    public boolean isMaquina() {
        return maquina;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getShampoo() {
        return shampoo;
    }

    public void setShampoo(int shampoo) {
        this.shampoo = shampoo;
    }

    public PetMachine(int agua, int shampoo, boolean maquina, boolean maquinasuja) {
        this.agua = 0;
        this.shampoo = 0;
        this.maquina = false;
        this.maquinasuja = false;
    }

    public void abastecerComAgua() {
        if (this.agua < 30) {
            this.agua = agua + 2;
            System.out.println("Tanque abastecido com mais 2 Litros de Água");
        } else {
            System.out.println("O tanque de água da máquina está cheio.");
        }
    }

    public void abastecerComShampoo() {
        if (this.shampoo < 10) {
            this.shampoo = shampoo + 2;
            System.out.println("Tanque abastecido com mais 2 Litros de Shampoo");
        } else {
            System.out.println("O tanque de shampoo da máquina está cheio.");
        }
    }

    public void verificarAgua() {
        if (getAgua() == 30) {
            System.out.println("");
            System.out.println("O tanque atingiu a sua capacidade máxima de água.");
        }
        System.out.printf("O tanque da máquina está com %d litros de água.", getAgua());
        System.out.println("");
    }

    public void verificarShampoo() {
        if (getShampoo() == 10) {
            System.out.println("");
            System.out.println("O tanque atingiu a sua capacidade máxima de shampoo.");
        }
        System.out.printf("O tanque da máquina está com %d litros de shampoo.", getShampoo());
        System.out.println("");
    }

    public void colocarPetNaMaquina() {
        if (maquinasuja == true) {
            System.out.println("A máquina está suja para receber outro pet.");
            System.out.println("limpe-a primeiro.");
        } else if (maquina == true) {
            System.out.println("Já tem um pet na máquina");
        } else {
            maquina = true;
            System.out.printf("O pet %s foi colocado na máquina.", pet.getNome());
            System.out.println("");
        }
    }

    public void retirarPetDaMaquina() {
        System.out.printf("Retirando o pet %s da máquina de banho\n", pet.getNome());
        maquina = false;
        maquinasuja = true;

    }

    public void darBanhoNoPet() {
        if (!maquina) {
            System.out.println("Não tem nenhum pet na máquina");
        } else if (agua < 10) {
            System.out.println("Água no tanque não é o suficiente para o banho.");
        } else if (shampoo < 2) {
            System.out.println("Não tem shampoo suficiente no tanque.");
        } else {
            this.agua = agua - 10;
            this.shampoo = shampoo - 2;
            System.err.printf("O pet %s está tomando banho...\n", pet.getNome());
            System.out.println("lavando os pelos...\n");
            System.out.println("lavando a barriga...\n");
            System.out.println("secando...\n");
            System.out.println("Banho finalizado...\n");
            this.maquinasuja = true;
        }

    }

    public void verificarSeTemPetNoBanho() {
        if (!maquina) {
            System.out.println("Não nenhum pet no banho.");
        } else if (maquinasuja == true && !maquina) {
            System.out.println("");
            System.out.println("Não tem pet no banho, mas a maquina está suja.");
            System.out.println("");
        } else {
            System.out.printf("O pet %s, está no banho.", pet.getNome());
            System.out.println("");
        }
    }

    public void limparMaquina() {
        if (!maquinasuja) {
            System.out.println("A máquina ja está limpa.");
        } else {
            System.out.println("Limpando máquina de banho...");
            this.agua = agua - 3;
            this.shampoo = shampoo - 1;
            this.maquinasuja = false;
        }
    }

}
