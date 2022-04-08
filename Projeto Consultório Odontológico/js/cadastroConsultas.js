$(() => {
    listarConsultas();

    function createOption(value, text) {
        var option = document.createElement('option');
        option.text = text;
        option.value = value;
        return option;
    }

    var hourSelect = document.getElementById('hours');
    for (var i = 8; i <= 18; i++) {
        hourSelect.add(createOption(i, i));
    }

    var minutesSelect = document.getElementById('minutes');
    for (var i = 0; i < 60; i += 15) {
        minutesSelect.add(createOption(i, i));
    }
    $("#listarNomeDentista").on("click", () => {


    })
    $("#listarNomePaciente").on("click", () => {

    })
    $("#enviarConsulta").on("click", () => {
        let horarioConsulta = $("#dataConsulta").val() +
            "T" +

            ($("#hours").val() > 9 ? $("#hours").val() : "0" + $("#hours").val()) +
            ":" +
            ($("#minutes").val() > 9 ? $("#minutes").val() : "0" + $("#minutes").val()) +
            ":00"

        console.log(horarioConsulta)
        const consulta = {
            dentista_id: $("#listarNomeDentista").val(),
            paciente_id: $("#listarNomePaciente").val(),
            horarioConsulta


            //"2022-06-18T14:30:00"
        }
        console.log(consulta)

        cadastroConsultas(consulta, "consulta")

    })
    $("#listarNomeCliente").on("click", () => {
        const consulta = {
            nome: $("#nomeCliente").val(),
            nomeDentista: $("#nomeDentista").val()

        }
        cadastroConsultas(consulta, "consulta")
        listarConsultas()
        listarDentistasConsulta()
    })



    $(document).on("click", ".removerConsulta", function() {
        let botao = $(this);
        console.log($(this).attr("id"));
        removerConsulta($(this).attr("id"), "consulta");
    })
})

function cadastroConsultas(data, rota) {
    let r = "";
    switch (rota) {
        case "consulta":
            r = "/consulta";
            break;
    }
    $.ajax({
            method: (data.id ? "PUT" : "POST"),
            url: "http://localhost:8080" + r,
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
        })
        .then(response => {
            console.log(response);
            listarConsultas()
        })
        .fail(error => {
            console.log(error)
        })
}

function listarConsultas() {
    $.ajax({
            method: "GET",
            url: "http://localhost:8080/consulta"
        })
        .then(response => {
            let linhas = "";

            response.forEach(el => {
                let date = new Date(el.horarioConsulta)

                linhas +=
                    `
                <tr>
                <td>${new Intl.DateTimeFormat('pt-BR'). format(date)} - ${date.toLocaleString('pt-BR').split(" ")[1]}</td>
                <td>${el.paciente.nome}</td>
                <td>${el.dentista.nome} - ${el.dentista.especializacao}</td>
                <td><button class="removerConsulta btn btn-danger" id="${el.id}">Remover</button></td>
                </tr>
                `
            });

            $("#listaConsultas tbody").html(linhas);
            console.log(response);
        })
        .fail(error => {
            console.log(error)
        })

}

function removerConsulta(id, rota) {
    let r = "";
    switch (rota) {
        case "consulta":
            r = `/consulta/${id}`;
            break;
    }
    $.ajax({
            method: "DELETE",
            url: "http://localhost:8080" + r
        })
        .then(response => {
            $("#" + id).parent().parent().remove();
            console.log(response);
        })
        .fail(error => {
            console.log(error)
        })
}

function listarDentistasConsulta() {
    $.ajax({
            method: "GET",
            url: "http://localhost:8080/dentista"
        })
        .then(response => {
            let linhas = "";
            response.forEach(el => {
                linhas +=
                    `
                    <option value="1"+1>${el.nome}</option>
                                `
            });

            $("#listaDentistas tbody").html(linhas);
            console.log(response);
        })
        .fail(error => {
            console.log(error)
        })

}