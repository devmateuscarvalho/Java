$(() => {
    listarPacientes();
    $("#enviarPaciente").on("click", () => {
        const paciente = {
            nome: $("#nomePaciente").val(),
            telefone: $("#telefone").val(),
        };
        cadastroPaciente(paciente, "paciente");

    });

    $(document).on("click", ".removerPaciente", function() {
        let botao = $(this);
        console.log($(this).attr("id"));
        removerPaciente($(this).attr("id"), "paciente");
    });
});

function cadastroPaciente(data, rota) {
    let r = "";
    switch (rota) {
        case "paciente":
            r = "/paciente";
            break;
    }
    $.ajax({
            method: data.id ? "PUT" : "POST",
            url: "http://localhost:8080" + r,
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
        })
        .then((response) => {
            console.log(response);
            listarPacientes();
        })
        .fail((error) => {
            console.log(error);
        });
}

function listarPacientes() {
    $.ajax({
            method: "GET",
            url: "http://localhost:8080/paciente",
        })
        .then((response) => {
            $("#listarNomePaciente").html("")
            let linhas = "";
            response.forEach((el) => {
                linhas += `
            <tr>
            <td>${el.id}</td>
            <td>${el.nome}</td>
            <td>${el.telefone}</td>
            <td><button class="removerPaciente btn btn-danger" id="${el.id}">REMOVER</button></td>
            </tr>
    `;
                $("#listarNomePaciente").append(`
    <option value="${el.id}">${el.nome}</option>
    `);
                console.log(el);

            });
            window.pacientes = response;
            $("#listaPaciente tbody").html(linhas);
            console.log(response);
        })
        .fail((error) => {
            console.log(error);
        });
}

function removerPaciente(id, rota) {
    let r = "";
    switch (rota) {
        case "paciente":
            r = `/paciente/${id}`;
            break;
    }
    $.ajax({
            method: "DELETE",
            url: "http://localhost:8080" + r,
        })
        .then((response) => {
            console.log(response);
            listarPacientes();
        })
        .fail((error) => {
            console.log(error);
        });
}