import React from "react";
import "antd/dist/antd.css";
import { Table } from "antd";
import UserService from "../service/UserService";

const columns = [
  {
    title: "Name",
    dataIndex: "name",
    sorter: true,
    render: (name) => `${name.first}`,
    width: "20%"
  },
  
  {
    title: "Username",
    dataIndex: "Username",
    width: "20%"
  },
  {
    title: "Email",
    dataIndex: "email",
  }
];

class UserList extends React.Component {
  state = {
    loading: false,
    data:[],
    pagination: {
      current: 1,
      pageSize: 5
    },
  };

  componentDidMount() {
    const { pagination } = this.state;
    this.fetch({ pagination });
  }

  handleTableChange = (pagination, filters, sorter) => {
    this.fetch({
      sortField: sorter.field,
      sortOrder: sorter.order,
      pagination,
      ...filters
    });
  };

  fetch = async (params = {}) => {
    this.setState({ loading: true });
 
    const data = await UserService.fetchUsers(params);
    console.log(data)

    //console.log(data)
    this.setState({
      loading: false,
      data: data && data.results,
      pagination: {
        ...params.pagination,
        total: 200 
      }
    });
    console.log()
  };

  render() {
    const { data, pagination, loading } = this.state;
    return (
      <Table
        columns={columns}
        rowKey={(record) => record.login.uuid}
        dataSource={data}
        pagination={pagination}
        loading={loading}
        onChange={this.handleTableChange}
      />
    );
  }
}

export default UserList;